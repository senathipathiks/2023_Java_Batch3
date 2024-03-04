package com.coreday2;

class StaticEx{
static int x =1;
void increment()
{
x++;
}
}
public class StaticDemo{
public static void main(String args[]){
StaticEx obj=new StaticEx();
obj.increment();
System.out.println(obj.x);
StaticEx obj1=new StaticEx();
System.out.println(obj1.x);
}
}

