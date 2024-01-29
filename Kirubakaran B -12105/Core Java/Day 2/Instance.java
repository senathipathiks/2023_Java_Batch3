package day2j;

public class Instance {
   static	int x=1;
	void inc() {
		x++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance q=new Instance();
		q.inc();
		System.out.println(q.x);
		Instance q1=new Instance();
		System.out.println(q1.x);
		System.out.println(2<3);
	}

}
