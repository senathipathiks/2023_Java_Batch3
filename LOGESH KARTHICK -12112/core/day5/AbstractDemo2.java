package core.day5;
abstract class Employe
{
	int eNo;
	String Name;
	int payperday;

void getData(int eNo,String Name,int payperday)
{
 this.eNo=eNo;
 this.Name=Name;
 this.payperday=payperday;
}
void display()
{
	System.out.println("Employye name :"+Name+""+"employee num:"+eNo);
}
abstract void calculateSalary();
public void read_Emp(int eNo2, String name2, int pay) {
	// TODO Auto-generated method stub
	
}
}
class contarct extends Employe
{
	int days;

	void get_contract(int eNo,String Name,int pay,int days)
	{
		super.read_Emp(eNo,Name,pay);
		this.days=days;
	}
	void calculateSalary() {
		System.out.println("salary based on contract");
		
		
	}
	
	}
class PartTime extends Employe
{
	int days;

	void get_contract(int eNo,String Name,int pay,int days)
	{
		super.read_Emp(eNo,Name,pay);
		this.days=days;
	}
	void calculateSalary() {
		System.out.println("salary based on parttime" + (days*days));
		
		
	}
	
	}
class Fulltime extends Employe
{
	int days;

	void get_contract(int eNo,String Name,int pay,int days)
	{
		super.read_Emp(eNo,Name,pay);
		this.days=days;
	}
	void calculateSalary() {
		System.out.println("salary based on Fulltime"+(days*days));
		
		
	}
	
	}


public class AbstractDemo2 {

	public static void main(String[] args) {
		contarct c= new contarct();
		c.calculateSalary();
	}

}
