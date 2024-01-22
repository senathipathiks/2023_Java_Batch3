package Day_2;

public class InstanceEg {

	int x=1;//instance variable
	int a=25,b=16;
	
	
	void increment() {
		x++;
		System.out.println(a>b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceEg s1=new InstanceEg();
		s1.increment();
		System.out.println(s1.x);
		
		InstanceEg s2=new InstanceEg();
		System.out.println(s2.x);
		
	}
   
}
