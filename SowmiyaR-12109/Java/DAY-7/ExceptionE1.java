package Day7;

class InvalidNo extends Exception
{
	InvalidNo(String mgs)
	{
		super(mgs);
	}
}
public class ExceptionE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1=110;
       try
       {
    	   if(num1>100)
    		   throw new InvalidNo("Number is invalid:provide the valid number between 1 to 100");
       }
       catch(InvalidNo e)
       {
    	   System.out.println(e);
       }
       System.out.println("Custom Generated Exception");
	}

}
