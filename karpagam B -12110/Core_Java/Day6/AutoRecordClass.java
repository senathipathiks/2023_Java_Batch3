package Com.Day6;

//alternative way of creating manualrecordclass

record Alien(int id,String Name) {// record is one of the class
	
//	public Alien(int id,String Name) {
//		if(id==0)
//			throw new IllegalArgumentException("id cannot be zero");
//		this.id=id;
//		this.Name=Name;
//	}
}
public class AutoRecordClass {
	public static void main(String[] args) {
		
		Alien a=new Alien(1,"kp");
//		Alien a1=new Alien(0,"kp");

		System.out.println(a);
//		System.out.println(a1);
		
	
		
		
		
	}

}
