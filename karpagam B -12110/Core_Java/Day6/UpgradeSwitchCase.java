package Com.Day6;

public class UpgradeSwitchCase {

	public static void main(String[] args) {
		
		String days="Wed";
	    String result=" ";
	    
//	    switch(days) {
//	    case "Saturday","Monday"->System.out.println("6 AM");
//	    case "Tuesday"->System.out.println("5 AM");
//	    default->System.out.println("7 AM");
//           }

	    result=switch(days) {
	    case "Saturday","Monday" : yield "6 AM";
	    case "Tuesday": yield "5 AM";
	    default: yield "7 AM";
	    };
	    System.out.println(result);
	    }
}
	

