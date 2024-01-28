package Com.Day6;

//to store the same set of element
public class EnumKey {

	public static void main(String[] args) {

		enum Days{Monday,Tuesday,Wed,Thurs,Fri,Saturday,Sun}
		
		Days day=Days.Fri;
		
		switch (day) {
		
		case Monday->System.out.println("Monday is a Lazy day");
		
		case Saturday,Sun->System.out.println("Saturday and Sunday i wake up at 8 AM");
		
		default->System.out.println("Week days I wake up at 7 AM");
		
		}
		
	}

}
