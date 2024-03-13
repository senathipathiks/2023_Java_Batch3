package core.day6;
class InvalidAge extends Exception
{
	InvalidAge(String msg)
	{
		super(msg);
	}
	
	
}
class ElectionCom
{
	public ElectionCom(int age) throws InvalidAge 
	{
	if (age<18 || age>110)
	{
		throw new InvalidAge("not eligible");
	}
	else
	{
		System.out.println("welcome to election commision of india");
	}
	}
}

public class InvalidAgeExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try
     {
    	 ElectionCom ec = new ElectionCom(67);
    	 
     }
     catch(Exception e)
     {
    	 System.out.println(e.getMessage());
     }
	}

}
