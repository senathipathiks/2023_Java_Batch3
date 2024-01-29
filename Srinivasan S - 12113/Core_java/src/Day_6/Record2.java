package Day_6;

record Alien(int id,String name) {
	public Alien(int id,String name) {
		this.id = id;
		this.name = name;
		if(id==0) {
			throw new IllegalArgumentException("Id cannot be zero");
		}		
		
	}
}

public class Record2 {

	public static void main(String[] args) {
		Alien a=new Alien(1, "Srini");
		System.out.println(a);

	}

}
