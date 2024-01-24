import java.util.*;
class Operations{
Scanner s = new Scanner(System.in);

int a = s.nextInt();
int b = s.nextInt();

void Add(){
System.out.println(a+b);
}

void Sub(){
System.out.println(a-b);
}

void Mul(){
System.out.println(a*b);
}

void Div(){
System.out.println(a/b);
}

void Remainder(){
System.out.println(a%b);
}

public static void main(String a[]){

Operations o = new Operations();

System.out.println("Enter the Numbers !!" );
o.Add();

o.Sub();

o.Mul();

o.Div();

o.Remainder();
}

}