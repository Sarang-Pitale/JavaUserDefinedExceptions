package com.sample;

public class Demo {
    public static void main(String[] args) {
      try {
          ReservationSystem reservationSystem = new ReservationSystem();
          reservationSystem.calculateTicketFare(3);
          reservationSystem.calculateTicketFare(20);
          reservationSystem.calculateTicketFare(70);
          reservationSystem.calculateTicketFare(150);
      }
      catch(InvalidAgeException e){
          System.out.println(e);
          System.out.println(e.getMessage());
          e.printStackTrace();
      }
      catch(Exception e){
          e.printStackTrace();
                }
      finally {
          System.out.println("the Final Condition");
      }
      }
}
