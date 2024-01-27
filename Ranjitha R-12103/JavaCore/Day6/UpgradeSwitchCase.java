package Day6;

public class UpgradeSwitchCase {

	public static void main(String[] args) {

		String days = "Wed";

		String result = "";

//        switch (days) {
//        case "Saturday","Sunday" -> System.out.println("6 AM");
//            
//        case "Monday" -> System.out.println("7 AM");
//
//        default -> System.out.println("5 AM");
//            
//        }

		result = switch (days) {
		case "Saturday", "Sunday":
			yield "6 AM";

		case "Monday":
			yield "7AM";

		default:
			yield ("5 AM");

		};

		System.out.println(result);

	}

}
