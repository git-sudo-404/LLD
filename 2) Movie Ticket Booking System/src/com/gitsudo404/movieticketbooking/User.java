package com.gitsudo404.movieticketbooking;

public class User {
  private Integer userId;
  private String userName;

  public User(
      Integer userId,
      String userName) {
    this.userId = userId;
    this.userName = userName;
  }

  public Integer getUserId() {
    return this.userId;
  }

  public String getUserName() {
    return this.userName;
  }
}
