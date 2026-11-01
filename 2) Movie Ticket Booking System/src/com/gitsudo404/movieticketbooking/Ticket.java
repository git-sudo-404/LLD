package com.gitsudo404.movieticketbooking;

import java.security.Timestamp;

public class Ticket {
  private String id;
  private String show; // movieName + showNumber
  private Integer seatNumber;
  private Timestamp startTime;
  private Timestamp endTime;

  public Ticket(
      String id,
      String show,
      Integer seatNumber,
      Timestamp startTime,
      Timestamp endTime) {
    this.id = id;
    this.show = show;
    this.seatNumber = seatNumber;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public void showTicket() {
    System.out.println("---------------- Ticket Details ------------------");
    System.out.println("Ticket ID :       " + id);
    System.out.println("Show :            " + show);
    System.out.println("Seat Number :     " + seatNumber);
    System.out.println("Show start time : " + startTime);
    System.out.println("Show end time :   " + endTime);
    System.out.println("--------------------------------------------------");
  }
}
