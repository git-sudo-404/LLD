package com.gitsudo404.movieticketbooking;

public class User {
  private String userName;
  private Integer userId;

  public User(
      String userName,
      Integer userId) {
    this.userName = userName;
    this.userId = userId;
  }

  public String getUserName() {
    return this.userName;
  }

  public Integer getUserId() {
    return this.userId;
  }
}
