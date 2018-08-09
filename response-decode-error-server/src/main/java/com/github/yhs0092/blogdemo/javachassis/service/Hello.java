package com.github.yhs0092.blogdemo.javachassis.service;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestSchema(schemaId = "hello")
@RequestMapping(path = "/hello")
public class Hello {
  private static final Logger LOGGER = LoggerFactory.getLogger(Hello.class);

  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public TestResponse test() {
    LOGGER.info("test() is called!");
    TestResponse response = new TestResponse();
    response.setContent("returnOK");
    LOGGER.info("test() response [{}]", response);
    return response;
  }
}
