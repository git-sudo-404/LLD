package com.gitsudo404.movieticketbooking;

public class Movie {
  private String title;
  private String description;
  private Integer rating;
  private String cast;
  private String director;

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public Integer getRating() {
    return rating;
  }

  public String getCast() {
    return cast;
  }

  public String getDirector() {
    return director;
  }

  public Movie(
      String title,
      String description,
      Integer rating,
      String cast,
      String director) {
    this.title = title;
    this.description = description;
    this.rating = rating;
    this.cast = cast;
    this.director = director;
  }
}
