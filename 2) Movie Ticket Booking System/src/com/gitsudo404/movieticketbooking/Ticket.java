package com.gitsudo404.movieticketbooking;

import java.time.LocalDateTime;

import com.gitsudo404.movieticketbooking.enums.ShowTypeEnum;

public class Ticket {
  private Integer ticketId;

  private Show show;
  private ShowSeat seat;
  private User bookedBy;

  public Ticket(
      Integer ticketId,
      Show show,
      ShowSeat seat,
      User bookedBy) {
    this.ticketId = ticketId;
    this.show = show;
    this.seat = seat;
    this.bookedBy = bookedBy;
  }

  public void generateTicket() {
    System.out.println("--------------------- Ticket ---------------------");
    System.out.println("Movie           : " + this.show.movie.getTitle());
    System.out.println("Ticket ID       : " + this.ticketId);
    System.out.println("Show start time : " + this.show.getStartTime());
    System.out.println("Show end time   : " + this.show.getEndTime());
    System.out.println("Screen number   : " + this.seat.getScreenNumber());
    System.out.println("Seat number     : " + this.seat.getSeatNumber());
    System.out.println("Seat row number : " + this.seat.getSeatRow());
    System.out.println("Booked by       : " + this.bookedBy.getUserName());
    System.out.println("--------------------------------------------------");
  }

}
