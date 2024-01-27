package Day6;

record Alian(int id,String name) {
	
	public Alian(int id,String name) {
		
		if(id==0)
			throw new IllegalArgumentException("id cannot be zero");
		
		this.id=id;
		this.name=name;
	}
	
}
public class AutoRecordClass {

	public static void main(String[] args) {
		
    Alian obj=new Alian(1,"Sowmi");
//    Alian obj1=new Alian(0,"Sowmi");
    System.out.println(obj);
	}

}
