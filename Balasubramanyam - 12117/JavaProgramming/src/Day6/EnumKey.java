package Day6;
public class EnumKey {
	public static void main(String[] args) {
		enum Days{Monday,Thuesday,wed,thurs,Fri,saturday,sun}
		Days day = Days.Fri;
		switch (day) {
		case Monday->System.out.println("Monday I wakeup 7 am");
		case saturday,sun->System.out.println("Sat and Sun I wakeup 8 am");
		default->System.out.println("weekdays i wake up 6 am");
		}
	}

}
