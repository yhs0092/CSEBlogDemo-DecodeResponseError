package com.github.yhs0092.blogdemo.javachassis.service;

public class TestResponse {
  private String content;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
  //  private Date content;
//
//  public Date getContent() {
//    return content;
//  }
//
//  public void setContent(Date content) {
//    this.content = content;
//  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("TestResponse{");
    sb.append("content='").append(content).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
