package Day7;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String mgs)
	{
		super(mgs);
	}
}
class ElectionCommision
{

	ElectionCommision(int age)throws InvalidAgeException
	{
		if(age<18 || age>110)
		{
			throw new InvalidAgeException("Not Eligible to vote");
			
		}
		else
		{
			System.out.println("Welcome to election commision of india");
		}
	}
}
 public class ElectionCommisionEx1{
	 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	   ElectionCommision obj=new ElectionCommision(13);
	}
   catch(InvalidAgeException e){
	   System.out.println(e.getMessage());
   }

	}
 }
	
