package com.sample;

public class ReservationSystem {
    void calculateTicketFare(int age) throws InvalidAgeException{
    if(age<5){
        System.out.println("fare is 0");
    }
    if (age>5 && age<60){
        System.out.println("fare is full");
    }

    if (age>60 && age<100){
            System.out.println("fare is half");
        }

   if(age>100){
          throw new InvalidAgeException("Invalid Age");
        }
    }
}
