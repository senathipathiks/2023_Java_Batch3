package Day4.Tasks;

import java.util.ArrayList;
import java.util.List;

class ReservationSystem {
    private List<String> availableFlights;
    private List<String> availableHotels;
    private List<String> bookedFlights;
    private List<String> bookedHotels;

    public ReservationSystem() {
        this.availableFlights = new ArrayList<>();
        this.availableHotels = new ArrayList<>();
        this.bookedFlights = new ArrayList<>();
        this.bookedHotels = new ArrayList<>();
    }

    public void searchFlights() {
        System.out.println("Searching for available flights...");
        // Logic to retrieve available flights from a data source
        availableFlights.add("Flight A");
        availableFlights.add("Flight B");
        availableFlights.add("Flight C");

        System.out.println("Available Flights:");
        for (String flight : availableFlights) {
            System.out.println(flight);
        }
    }

    public void searchHotels() {
        System.out.println("Searching for available hotels...");
        // Logic to retrieve available hotels from a data source
        availableHotels.add("Hotel X");
        availableHotels.add("Hotel Y");
        availableHotels.add("Hotel Z");

        System.out.println("Available Hotels:");
        for (String hotel : availableHotels) {
            System.out.println(hotel);
        }
    }

    public void bookFlight(String flight) {
        if (availableFlights.contains(flight)) {
            availableFlights.remove(flight);
            bookedFlights.add(flight);
            System.out.println("Flight '" + flight + "' booked successfully!");
        } else {
            System.out.println("Sorry, the selected flight is not available.");
        }
    }

    public void bookHotel(String hotel) {
        if (availableHotels.contains(hotel)) {
            availableHotels.remove(hotel);
            bookedHotels.add(hotel);
            System.out.println("Hotel '" + hotel + "' booked successfully!");
        } else {
            System.out.println("Sorry, the selected hotel is not available.");
        }
    }

    public void cancelFlight(String flight) {
        if (bookedFlights.contains(flight)) {
            bookedFlights.remove(flight);
            availableFlights.add(flight);
            System.out.println("Flight '" + flight + "' canceled successfully!");
        } else {
            System.out.println("Sorry, the selected flight is not booked.");
        }
    }

    public void cancelHotel(String hotel) {
        if (bookedHotels.contains(hotel)) {
            bookedHotels.remove(hotel);
            availableHotels.add(hotel);
            System.out.println("Hotel '" + hotel + "' canceled successfully!");
        } else {
            System.out.println("Sorry, the selected hotel is not booked.");
        }
    }
}

public class ReservationSystemTest {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

        // Search for available flights
        reservationSystem.searchFlights();

        // Search for available hotels
        reservationSystem.searchHotels();

        // Book a flight
        reservationSystem.bookFlight("Flight A");

        // Book a hotel
        reservationSystem.bookHotel("Hotel X");

        // Cancel a flight
        reservationSystem.cancelFlight("Flight B");

        // Cancel a hotel
        reservationSystem.cancelHotel("Hotel Y");
    }
}
