package com.javacoreday4;

//TravelApp.java
import java.util.ArrayList;
import java.util.Random;

class TravelApp {
private ArrayList < Flight > flights;
private ArrayList < Hotel > hotels;

public TravelApp() {
  this.flights = new ArrayList < Flight > ();
  this.hotels = new ArrayList < Hotel > ();
}

public void searchFlights(String origin, String destination, String date, int numPassengers) {
  System.out.println("Searching for flights from " + origin + " to " + destination + " on " + date + " for " + numPassengers + " passengers.");
}

public void searchHotels(String location, String checkIn, String checkOut, int numGuests) {
  System.out.println("Searching for hotels in " + location + " from " + checkIn + " to " + checkOut + " for " + numGuests + " guests.");
}

public void bookFlight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
  Flight flight = new Flight(flightNumber, passengerName, origin, destination, date, numPassengers, price);
  int confirmationNumber = generateConfirmationNumber();
  flight.setConfirmationNumber(confirmationNumber);
  this.flights.add(flight);
  System.out.println("Flight booked! Confirmation number: " + confirmationNumber);
}

public void bookHotel(int hotelId, String guestName, String location, String checkIn, String checkOut, int numGuests, double price) {
  Hotel hotel = new Hotel(hotelId, guestName, location, checkIn, checkOut, numGuests, price);
  int confirmationNumber = generateConfirmationNumber();
  hotel.setConfirmationNumber(confirmationNumber);
  this.hotels.add(hotel);
  System.out.println("Hotel booked! Confirmation number: " + confirmationNumber);
}

public void cancelReservation(int confirmationNumber) {
  // Cancel a flight or hotel reservation based on confirmation number
  for (Flight flight: this.flights) {
    if (flight.getConfirmationNumber() == confirmationNumber) {
      this.flights.remove(flight);
      System.out.println("Flight reservation with confirmation number " + confirmationNumber + " cancelled.");
      return;
    }
  }
  for (Hotel hotel: this.hotels) {
    if (hotel.getConfirmationNumber() == confirmationNumber) {
      this.hotels.remove(hotel);
      System.out.println("Hotel reservation with confirmation number " + confirmationNumber + " cancelled.");
      return;
    }
  }
  System.out.println("No reservation found with confirmation number " + confirmationNumber + ".");
}

private int generateConfirmationNumber() {
  // Generate a random 6-digit confirmation number
  Random rand = new Random();
  return rand.nextInt(900000) + 100000;
}
}
//Flight.java
 class Flight {
  private int flightNumber;
	private String passengerName;
  private String origin;
  private String destination;
  private String date;
  private int numPassengers;
	private double price;
  private int confirmationNumber;

public Flight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
  this.flightNumber = flightNumber;
  this.passengerName = passengerName;
  this.origin = origin;
  this.destination = destination;
  this.date = date;
  this.numPassengers = numPassengers;
  this.price = price;
}

  public int getFlightNumber() {
      return flightNumber;
  }
	
  public String getPassengerName() {
      return passengerName;
  }

  public String getOrigin() {
      return origin;
  }

  public String getDestination() {
      return destination;
  }

  public String getDate() {
      return date;
  }

  public int getNumPassengers() {
      return numPassengers;
  }

   public double getPrice() {
      return price;
  }
  public int getConfirmationNumber() {
      return confirmationNumber;
  }

  public void setConfirmationNumber(int confirmationNumber) {
      this.confirmationNumber = confirmationNumber;
  }
}
 
//Hotel.java
 class Hotel {
 private int hotelId;
 private String name;
 private String location;
 private String checkIn;
 private String checkOut;
 private int numGuests;
 private double price;
 private int confirmationNumber;

 public Hotel(int hotelId, String name, String location, String checkIn, String checkOut, int numGuests, double price) {
   this.hotelId = hotelId;
   this.name = name;
   this.location = location;
   this.checkIn = checkIn;
   this.checkOut = checkOut;
   this.numGuests = numGuests;
   this.price = price;
 }
 public int getHotelId() {
   return hotelId;
 }

 public String getName() {
   return name;
 }

 public String getLocation() {
   return location;
 }

 public String getCheckIn() {
   return checkIn;
 }

 public String getCheckOut() {
   return checkOut;
 }

 public double getPrice() {
   return price;
 }

 public int getNumGuests() {
   return numGuests;
 }

 public int getConfirmationNumber() {
   return confirmationNumber;
 }

 public void setConfirmationNumber(int confirmationNumber) {
   this.confirmationNumber = confirmationNumber;
 }
}




public class FlightTicketSystem {
	 public static void main(String[] args) {
		    TravelApp app = new TravelApp();
		    app.searchFlights("New York", "London", "2022-09-01", 1);
		    app.searchHotels("London", "2023-08-01", "2023-09-05", 2);
		    app.bookFlight(12345670, "Dharshsun", "New York", "London", "2023-08-01", 1, 70000.00);
		    app.bookFlight(67843513, "Prem", "New York", "London", "2023-08-01", 1, 65500.00);
		    app.bookHotel(98765432, "Vignesh", "London", "2023-09-01", "2023-09-05", 1, 10000.00);
		    // Cancel a flight or hotel reservation based on reservation number
		    app.cancelReservation(12345670);
		  }

}
