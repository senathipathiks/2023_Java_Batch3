package Day_6;

public class EnumEg1 {

	public static void main(String[] args) {
		enum Days{Sun,Mon,Tue,Wed,Thu,Fri,Sat}
		
//		Days day=Days.Sun;
//		
//		switch(day) {
//		case Sat-> System.out.println("Wake up at 8 AM");
//		case Sun->System.out.println("Wake up at 10 AM");
//		default-> System.out.println("Wake up at 7 AM");
//		}
		String day="Wed";
		String result=switch (day) {
		case "Wed":yield("Wake up at 8 AM");
		case "Sat":yield("Wake up at 10 AM");
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		};
		System.out.println(result);

	}
}
