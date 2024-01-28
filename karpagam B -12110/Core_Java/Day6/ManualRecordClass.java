package Com.Day6;

import java.util.Objects;

class container{
	private  int id;
	private String name;
	
	public container(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "container [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		container other = (container) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
    
}

public class ManualRecordClass {

	public static void main(String[] args) {
		
       container c=new container(123,"Guna");
       container c1=new container(123,"Guna"); // both values are same, but if we dont override equals it will return false
       System.out.println(c);
       System.out.println(c1);
       System.out.println(c.equals(c1));
       
       
	}

}
