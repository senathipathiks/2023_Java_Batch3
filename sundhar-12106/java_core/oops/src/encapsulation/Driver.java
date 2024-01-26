package encapsulation;

/*
 * Encapsulation is the process of binding states and behavior with the help of class
 * the advantage of encapsulation is data hiding(with the help of private data members)
 * 
 * data hiding : 
 *     the process of hiding the important data and providing the restricted access with 
 *     the help of getters and setters.
 * 
 * */
public class Driver {
	
	public static void main(String[] args) {
		
		Pen ob = new Pen();
//		System.out.println(ob.ink); we cannot directly access the ink variable 
		System.out.println(ob.getInk()); //accessing with the help of 
	}	
}

class Pen{
	
	String name = "reynolds";
	private String ink = "German";
	
	public void setInk(String ink) {
		this.ink = ink ;
	}
	
	public String getInk() {
		return ink;
	}
}


