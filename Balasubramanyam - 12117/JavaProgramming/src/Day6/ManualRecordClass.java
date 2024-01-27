package Day6;

import java.util.Objects;

class Record{
	private int id;
	private String name;
	public Record(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Record [id=" + id + ", name=" + name + "]";
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Record other = (Record) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
//	
}
public class ManualRecordClass {

	public static void main(String[] args) {
		Record r = new Record(1,"balu");
		Record r1 = new Record(1,"balu");
		System.out.println(r1);
		System.out.println(r.equals(r1));

	}

}
