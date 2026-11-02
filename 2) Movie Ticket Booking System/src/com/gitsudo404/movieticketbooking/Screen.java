package com.gitsudo404.movieticketbooking;

import java.util.ArrayList;

public class Screen {
  private Integer screenNumber;
  private String screenType;
  private Integer numberOfSeats;
  private Integer numberOfRows;
  private Integer numberOfCols;

  public Screen(
      Integer screenNumber,
      String screenType,
      Integer numberOfSeats,
      Integer numberOfCols) {
    this.screenNumber = screenNumber;
    this.screenType = screenType;
    this.numberOfSeats = numberOfSeats;
    this.numberOfCols = numberOfCols;
    Integer numberOfRows = (numberOfSeats + numberOfCols - 1) / numberOfCols; // ceil division
    this.numberOfRows = numberOfRows;
  }

  public Integer getNumberOfCols() {
    return this.numberOfCols;
  }

  public Integer getScreenNumber() {
    return this.screenNumber;
  }

  public Integer getNumberOfSeats() {
    return this.numberOfSeats;
  }

  public Integer getNumberOfRows() {
    return this.numberOfRows;
  }

  public String getScreenType() {
    return this.screenType;
  }
}
