package com.coreday3;

class StudentEx {
    private int rollNo;
    private String name;
    
    public StudentEx() {
        System.out.println("This is Super Class Default Constructor");
    }
    
    public StudentEx(int rollNo,String name) {
        this.rollNo = rollNo;
        this.name = name;
        System.out.println("This is Super Class Parameterized Constructor");
    }

    @Override
    public String toString() {
        return "StudentEx [rollNo=" + rollNo + ", name=" + name + "]";
    }
    
}

class Mark extends StudentEx{
    private int mark1;
    private int mark2;
    private int mark3;
    
    public Mark() {
        System.out.println("This is base Class Default Constructor");
    }
    
    public Mark(int mark1,int mark2,int mark3) {
        super(112,"Vignesh");
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    public String toString() {
        return "Mark [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", toString()=" + super.toString()
                + "]";
    }
    
}
public class Constructor1 {


	public static void main(String[] args) {
		StudentEx obj = new Mark (123,345,678);
		System.out.println(obj.toString());
		

	}

}
