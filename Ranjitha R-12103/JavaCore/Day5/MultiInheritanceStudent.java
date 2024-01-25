//student,personal info,college info
package Day5;

interface Student {

	void display_Personal_Info();

	void display_College_Info();
}

class Personal_Info implements Student {
	String name;
	String address;
	int phno;
	int sid;
	char sGrade;
	String Dept;

	Personal_Info(String name, String address, int phno) {
		this.name = name;
		this.address = address;
		this.phno = phno;

	}

	@Override
	public void display_Personal_Info() {
		System.out.println(
				"The Student personal information: Name: " + name + " Address: " + address + " PhoneNo: " + phno);
	}

	public void display_College_Info() {
		// TODO Auto-generated method stub

	}

}

class College_Info implements Student {
	String name;
	String address;
	int phno;
	int sid;
	char sGrade;
	String Dept;

	College_Info(int sid, String name, String Dept, char sGrade, String address, int phno) {
		this.name = name;
		this.address = address;
		this.phno = phno;
		this.sid = sid;
		this.sGrade = sGrade;
		this.Dept = Dept;

	}

	@Override
	public void display_College_Info() {
		System.out.println("The Student College information: Student id: " + sid + " Name: " + name + "Department: "
				+ Dept + " Grade:" + sGrade + " Address: " + address + " PhoneNo: " + phno);

	}

	@Override
	public void display_Personal_Info() {
		// TODO Auto-generated method stub

	}
}

public class MultiInheritanceStudent {

	public static void main(String[] args) {
		Personal_Info obj1 = new Personal_Info("Ranjitha", "Cuddalore", 56790876);
		obj1.display_Personal_Info();

		College_Info obj2 = new College_Info(12103, "Ranjitha", "CSE", 'A', "Cuddalore", 576332403);
		obj2.display_College_Info();
		

	}

}
