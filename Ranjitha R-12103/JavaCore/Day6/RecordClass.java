package Day6;

import java.util.Objects;

class Record {
	private int id;
	private String name;

//constructor for initialize the data members
	public Record(int id, String name) {
		this.id = id;
		this.name = name;
	}

//to string method the two object values
	@Override
	public String toString() {
		return "Record [id=" + id + ", name=" + name + "]";
	}

//for equaling the two object values
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
		Record other = (Record) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}

public class RecordClass {

	public static void main(String[] args) {

		Record r1 = new Record(11, "Ranjitha");
		Record r2 = new Record(11, "Ranjitha");
		// System.out.println(r1);
		System.out.println(r1.equals(r2));
	}

}
