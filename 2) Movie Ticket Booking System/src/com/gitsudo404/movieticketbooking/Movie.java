package com.gitsudo404.movieticketbooking;

public class Movie {
  private String title;
  private String description;
  private Integer rating;
  private Integer duration;
  // private String language; //lemme just keep it simple here , since our focus
  // is on the design

  public Movie(
      String title,
      String description,
      Integer rating,
      Integer duration) {
    this.title = title;
    this.description = description;
    this.rating = rating;
    this.duration = duration;
  }

  public String getTitle() {
    return this.title;
  }

  public String getDescription() {
    return this.description;
  }

  public Integer getRating() {
    return this.rating;
  }

  public Integer getDuration() {
    return this.duration;
  }
}
