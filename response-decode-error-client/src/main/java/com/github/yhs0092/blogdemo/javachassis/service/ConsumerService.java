package com.github.yhs0092.blogdemo.javachassis.service;

import org.apache.servicecomb.provider.pojo.RpcReference;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestSchema(schemaId = "consumer")
@RequestMapping(path = "/consumer")
public class ConsumerService {
  private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerService.class);

  @RpcReference(microserviceName = "server", schemaId = "hello")
  private HelloInterface hello;

  @RequestMapping(path = "/test", method = RequestMethod.GET)
  public String test() {
    LOGGER.info("test() is called!");
    TestResponse response = hello.test();
    LOGGER.info("response is [{}]", response);
    return response.toString();
  }
}
