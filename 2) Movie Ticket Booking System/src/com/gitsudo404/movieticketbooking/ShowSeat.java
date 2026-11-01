package com.gitsudo404.movieticketbooking;

public class ShowSeat {

  private Integer seatNumber;
  private Integer screenNumber; // which physical screen the seat belongs to
  private Integer rowNumber;
  private User bookedBy;

  public Integer getSeatNumber() {
    return this.seatNumber;
  }

  public Integer getScreenNumber() {
    return this.screenNumber;
  }

  public Integer getRowNumber() {
    return this.rowNumber;
  }

  public Boolean isBooked() {
    return this.bookedBy != null;
  }

  public ShowSeat(
      Integer seatNumber,
      Integer screenNumber,
      Integer rowNumber) {
    this.seatNumber = seatNumber;
    this.screenNumber = screenNumber;
    this.rowNumber = rowNumber;
    this.bookedBy = null;
  }

  public void setBookedBy(User user) {
    this.bookedBy = user;
  }
}
