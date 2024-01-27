package Day6;

record Student(int id, String name) {

//	public Student(int id, String name) {
//		this.id = id;
//		this.name = "name";
//		if (id == 0) {
//			throw new IllegalArgumentException("Id cannot be zero");
//
//		}
//	}
}

public class AutoRecordClass {

	public static void main(String[] args) {
		Student stud1 = new Student(11, "Ranjitha");
		// Student stud2 = new Student(0, "Ram");
		System.out.println(stud1);

	}

}
