# JavaUserDefinedExceptions
Implementation of User Defined Exceptions

A user defined exception in Java is subclass of throwable or exception. 
The example presented here in this repository consists of a user defined exception called invalid age exception.
So we have implemented one reservation system here.Reservation system class consists of a method called calculateTicketFare.
The method calculates the fear based on age if age is less than 5 it will display the fear is zero if the age is greater than 5 and less than 60 it will display the fare is full.
If the age is greater than 60 it will display the fare is half.
If the age is greater than 100 so the code is throwing a user defined exception called InvalidAgeException.
To throw any undefined exception or exception which we have defined we need to use a throw keyword.
If a method is throwing an exception we can define the method as risky method by using throws keyword.
Java restricts the calling of risky method and gives us a compile time error if we are not calling that method using try catch block.
We are creating object of invalid age exception and passing details like invalid age inside it after that that invalid age message is passed to the super class by the constructor using super keyword.
The superclass utilises this message and it will print print it in details of its defined method like printStackTrace() or getmessage(). 