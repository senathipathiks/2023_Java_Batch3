package com.day6.seminar;

//Sealed classes are used to restrict the users from inheriting the class. 
//A class can be sealed by using the sealed keyword. 
//The keyword tells the compiler that the class is sealed, and therefore, cannot be extended.
//No class can be derived from a sealed class.

//Sealed class inherited class must be tie up with keywords 1.sealed 2.non-sealed 3.final
//permits - used to privilege the specific mentioned classes


public sealed class Computer permits Laptop {
  
  String ComputerName;
  String Features;
  double price;
  
  public Computer(String Cname, String Cfeatures,double price) {
      
      this.ComputerName=Cname;
      this.Features=Cfeatures;
      this.price=price;
      
  }
  
  
  void display3(){
      
      System.out.println("Computer Name is :"+ComputerName+
              "\nComputer Features :"+Features+
              "\nPrice :"+price);
  }
  
  
  
  

  public static void main(String[] args) {
      
      
      MobilePhone m = new MobilePhone("Apple","32 GB RAM",600000);
      
      m.display();
      
      System.out.println("_____________________________________________");
      m.display2();
      System.out.println("_____________________________________________");
      m.display3();
      
      
  }

}


non-sealed class Laptop extends Computer{
  String LaptopName;
  String Features;
  double price;
  
  public Laptop(String Lname, String Lfeatures,double price) {
      
      super("Lenova","16GB RAM",40000);
      
      this.LaptopName=Lname;
      this.Features=Lfeatures;
      this.price=price;
      
      
      
  }
  
  void display2() {
      

      System.out.println("Laptop Name is :"+LaptopName+
              "\nLaptop Features :"+Features+
              "\nPrice :"+price);
      
  }
  
  
  
}

final class MobilePhone extends Laptop{
  
  
  String MobileName;
  String MFeatures;
  double price;
  

  public MobilePhone(String Mname, String Mfeatures, double price) {
      super("HP", "8 GB", 30000);
  
      this.MobileName=Mname;
      this.MFeatures=Mfeatures;
      this.price=price;
      
      
  }
  
  void display() {
      

      System.out.println("Mobile Name is :"+MobileName+
              "\nMobile Features :"+MFeatures+
              "\nPrice :"+price);
      
  }
  
  
}