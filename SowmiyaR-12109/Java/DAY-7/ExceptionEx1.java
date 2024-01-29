package Day7;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Array";
		int a[]= {1,2,3,4,0};
		int b=10,c;
		try {
			 c = b/a[5];
		}
		catch(Exception e){
		 System.out.println(e);
			
		}

	}

}
