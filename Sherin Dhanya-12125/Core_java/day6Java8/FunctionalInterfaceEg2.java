package com.day6Java8;
import java.util.*;
import java.util.function.Predicate;
public class FunctionalInterfaceEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names=Arrays.asList("Sherin","Dhanya","Smart");
Predicate<String>p=(s)->s.startsWith("S");
for(String st:names) {
	if(p.test(st))
		System.out.println(st);
}
	}

}
