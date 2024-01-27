package com.Day4Oops;
class Bookings{
    void Book() {
		System.out.println("Book Flights and Hotels reservations");
	} 
	void Cancel() {
		System.out.println("Cancel the reservations");
	}
}
class Flights extends Bookings{
	void Book() {
		System.out.println("Book Flights reservations");
	} 
	void Cancel() {
		System.out.println("Cancel the Flight reservations");
	}
}
class  Hotels extends Bookings{
    void Book() {
    	System.out.println("Book Hotels reservations");
	} 
	void Cancel() {
		System.out.println("Cancel the Hotel reservations");
	}
}
public class Booking {

	public static void main(String[] args) {
		Flights f = new Flights();
		f.Book(); f.Cancel();
		Hotels h = new Hotels();
		h.Book(); h.Cancel();
	}

}
