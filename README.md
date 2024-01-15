# JavaUserDefinedExceptions
Implementation of User-Defined Exceptions

A user-defined exception in Java is a subclass of  Throwable or Exception. 
The example presented here in this repository consists of a user-defined exception called InvalidAgeException.
So we have implemented one reservation system here. The reservation system class consists of a method called calculateTicketFare.
The method calculates the fare based on age, if the age is less than 5 it will display the fare is zero if the age is greater than 5 and less than 60 it will display the fare is full.
If the age is greater than 60 it will display the fare is half.
If the age is greater than 100 the code is throwing a user-defined exception called InvalidAgeException.
To throw any undefined exception or exception which we have defined we need to use a throw keyword.
If a method is throwing an exception we can define the method as a risky method by using the throws keyword.
Java restricts the calling of risky methods and gives us a compile-time error if we are not calling that method using try-catch block.
We are creating an object of InvalidAgeException and pass details like "invalid age" inside it after that invalid age message is passed to the superclass by the constructor using the super keyword.
The superclass utilizes this message and it will print it in details of its defined method like printStackTrace() or getmessage(). 
