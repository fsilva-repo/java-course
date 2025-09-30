package com.web.app.model;

public class Item {
  private String msg;
  public Item(String msg) {
    this.msg = msg;
    this.getMsg();
  }
  public String getMsg() {
    return msg;
  }

}
