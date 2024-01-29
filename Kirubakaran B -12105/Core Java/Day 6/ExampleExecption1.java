package day3exception;

public class ExampleExecption1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="array";
		int arr[]= {12,10,8,4,0};
		int b=2;
		try {
			int c=b/arr[4];
			System.out.println(c);
			}
			 catch (Exception e) {
					System.out.println("catch executed");
					e.printStackTrace();
				}
				
			try {
				System.out.println(str.charAt(9));
			}
			catch (Exception e)
			{
			
				e.printStackTrace();
			}
		}
				

	}


