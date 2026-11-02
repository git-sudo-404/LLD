package com.gitsudo404.movieticketbooking;

public class ShowSeat {
  private Integer seatNumber;
  private Integer seatRow;
  private Integer screenNumber;
  private User bookedBy;

  public ShowSeat(
      Integer seatNumber,
      Integer seatRow,
      Integer screenNumber) {
    this.seatNumber = seatNumber;
    this.seatRow = seatRow;
    this.screenNumber = screenNumber;
    this.bookedBy = null;
  }

  public User getBookedBy() {
    return this.bookedBy;
  }

  public Integer getSeatNumber() {
    return this.seatNumber;
  }

  public Integer getSeatRow() {
    return this.seatRow;
  }

  public Integer getScreenNumber() {
    return this.screenNumber;
  }
}
