package com.gitsudo404.movieticketbooking;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.gitsudo404.movieticketbooking.enums.ShowTypeEnum;

public class Show {

  private ShowTypeEnum showType;
  private LocalDateTime startTime;
  private LocalDateTime endTime;

  public Movie movie;
  private Screen screen;
  private ArrayList<ShowSeat> seats;

  public Show(
      ShowTypeEnum showType,
      LocalDateTime startTime,
      LocalDateTime endTime,
      Movie movie,
      Screen screen) {
    ArrayList<ShowSeat> newSeats = new ArrayList<ShowSeat>();

    Integer seatNumber = 1;

    for (Integer rowNumber = 1; rowNumber <= this.screen.getNumberOfCols(); rowNumber++) {
      for (Integer colNumber = 1; colNumber <= this.screen.getNumberOfCols(); colNumber++) {
        ShowSeat newSeat = new ShowSeat(seatNumber, rowNumber, this.screen.getScreenNumber());
        newSeats.add(newSeat);
        seatNumber++;
        if (seatNumber > this.screen.getNumberOfSeats()) {
          break;
        }
      }
    }
    this.seats = newSeats;
  }

  public ShowTypeEnum getShowType() {
    return this.showType;
  }

  public LocalDateTime getStartTime() {
    return this.startTime;
  }

  public LocalDateTime getEndTime() {
    return this.endTime;
  }
}
