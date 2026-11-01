package com.gitsudo404.movieticketbooking;

import java.security.Timestamp;
import java.util.ArrayList;

public class Show {
  private Integer showNumber; // the 1st or 2nd ... ,
  private Integer screenNumber;
  private Timestamp startTime;
  private Timestamp endTime;
  private Movie movie;
  private ArrayList<ShowSeat> seats;

  public Integer getShowNumber() {
    return this.showNumber;
  }

  public Integer getScreenNumber() {
    return this.screenNumber;
  }

  public Timestamp getStartTime() {
    return this.startTime;
  }

  public Timestamp getEndTime() {
    return this.endTime;
  }

  public Movie getMovie() {
    return this.movie;
  }

  public ArrayList<ShowSeat> getSeats() {
    return this.seats;
  }

  public ArrayList<ShowSeat> getAvailableSeats() {
    ArrayList<ShowSeat> availableSeats = new ArrayList<ShowSeat>();
    for (ShowSeat showSeat : this.seats) {
      if (!showSeat.isBooked()) {
        availableSeats.add(showSeat);
      }
    }
    return availableSeats;
  }
}
