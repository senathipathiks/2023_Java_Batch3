package Day6;
public class Enumkwy {

    public static void main(String[] args) {
        enum Days{Monday,Thusday,Wed,Thursday,Fri,Saturday,Sun}
        
        Days day=Days.Fri;
        
        switch(day) {
        case Monday->System.out.println("");
        case Saturday,Sun->System.out.println("Sat & Sun I wakeup 8am");
        
        default->System.out.println("Week days I wakeup 6 am");
        }

    }

}