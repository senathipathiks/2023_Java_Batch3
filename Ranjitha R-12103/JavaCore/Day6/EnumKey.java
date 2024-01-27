package Day6;

//same set of elements stored in enum,its one of the class
public class EnumKey {

	public static void main(String[] args) {
		enum Days {
			Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
		}
		Days day = Days.Thursday;
		switch (day) {
		case Monday -> System.out.println("Monday ia am wake up  7 am");
		case Saturday, Sunday -> System.out.println("Sat& Sun i wake up 8 am");
		default -> System.out.println("week days I wake up 6 am");
		}

	}

}
