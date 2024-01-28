package com.day3array;
import java.util.Arrays;
public class ArrayEg1 {

	public static void main(String[] args) {
int arr[]= {10,20,30,40};
String[] name= {"Sherin","Vino","Kiruba","Jothi"};

System.out.println(arr.length);
/*for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
*/
for(int i:arr)
{
	System.out.println(i);
}

for(String s:name) {
	System.out.println(s);
}
	}

}
