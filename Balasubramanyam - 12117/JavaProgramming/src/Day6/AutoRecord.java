package Day6;
record Alian(int id,String name) {
	public Alian(int id,String name) {
		
		this.id = id;
		this.name =name;
		if(id==0) 
			throw new IllegalArgumentException("Id cant be zero");
	}
}
public class AutoRecord {

	public static void main(String[] args) {
		Alian a= new Alian(1,"BALU");
        System.out.println(a.id());
        System.out.println(a.name());
	}

}
