package Java_Day_2;


import java.util.*;
class operator{
Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
int b=sc.nextInt();
void addition(){
System.out.println(a+b);
}
void substraction(){
System.out.println(a-b);
}
void multiplication(){
System.out.println(a*b);
}
void division(){
System.out.println(a/b);
}
void remainder(){
System.out.println(a%b);
}

public static void main(String args[])
{
operator obj=new operator();
obj.addition();
obj.substraction();
obj.multiplication();
obj.division();
obj.remainder();
}
}


