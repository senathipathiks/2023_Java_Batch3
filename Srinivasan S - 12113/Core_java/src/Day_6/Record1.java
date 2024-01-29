package Day_6;

import java.util.Objects;

class Container{
	private int id;
	private String name;
	
	public Container(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Container [id=" + id + ", name=" + name + "]";
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
		Container other = (Container) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}

public class Record1 {

	public static void main(String[] args) {
		Container c=new Container(1, "Srinivasan");
		Container c1=new Container(1, "Srinivasan");
		System.out.println(c);
		System.out.println(c.equals(c1));

	}

}
