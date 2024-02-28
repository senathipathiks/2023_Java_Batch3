import java.util.*;
class Sample{

     public static void main (String args[]){
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter the first number: ");
       int a = obj.nextInt();
       System.out.print("Enter the second number: ");
       int b = obj.nextInt();
       int c = a + b;
       System.out.println(c);
}
}