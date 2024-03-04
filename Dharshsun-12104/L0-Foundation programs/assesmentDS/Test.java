package com.assesmentDS;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

//class A{
//static void method(){
//System.out.println("Class A method");
//}
//}
//class B extends A{
//static void method(){
//System.out.println("Class B method");
//}
//}
public class Test{
public static void main(String args[]){
	List<String> list = new ArrayList<>();
	list.add("Java");
	list.add("Python");
	list.add("Scala");
	System.out.println(list.subList(1, 3));
}
}
