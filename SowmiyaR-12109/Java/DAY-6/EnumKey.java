package Day6;

public class EnumKey {

	public static void main(String[] args) {
		
		enum Days{Monday,Tuesday,wed,thurday,fri,saturday,sunday};
		Days day=Days.fri;
		
		switch(day) {
		case Monday->System.out.println("Monday I wakeup 7 Am");
		
		case saturday,sunday->System.out.println("Saturday or sunday i wakeup 6 Am");
		
		default ->System.out.println("I wakeup 5 Am");
		}

	}

}
