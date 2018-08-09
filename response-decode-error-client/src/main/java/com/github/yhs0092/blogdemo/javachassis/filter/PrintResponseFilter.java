package com.github.yhs0092.blogdemo.javachassis.filter;

import org.apache.servicecomb.common.rest.filter.HttpClientFilter;
import org.apache.servicecomb.core.Invocation;
import org.apache.servicecomb.foundation.vertx.http.HttpServletRequestEx;
import org.apache.servicecomb.foundation.vertx.http.HttpServletResponseEx;
import org.apache.servicecomb.swagger.invocation.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintResponseFilter implements HttpClientFilter {
  private static final Logger LOGGER = LoggerFactory.getLogger(PrintResponseFilter.class);

  @Override
  public int getOrder() {
    return 0;
  }

  @Override
  public void beforeSendRequest(Invocation invocation, HttpServletRequestEx httpServletRequestEx) {

  }

  @Override
  public Response afterReceiveResponse(Invocation invocation, HttpServletResponseEx httpServletResponseEx) {
    LOGGER.info("get response, status[{}], content is [{}]",
        httpServletResponseEx.getStatus(), httpServletResponseEx.getBodyBuffer());
    return null;
  }
}
