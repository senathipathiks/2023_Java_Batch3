package com.day4;
import java.util.*;
public class Qccc {
   public static void main(String[] args) {
	   Queue<Integer> qq=new LinkedList<Integer>();
	   qq.offer(1);
	   qq.offer(2);
	   qq.offer(3);
	   qq.offer(4);
	   qq.add(5);
	   qq.offer(6);
       System.out.println(qq);
	   System.out.println(qq.peek());
	   System.out.println(qq.poll());
	   for(;qq.size()>0;) {
		   System.out.println(qq.poll());
		   System.out.println(qq);
	   }
		   
       while(!qq.isEmpty()) {
    	   System.out.println(qq.poll());
    	   System.out.println(qq);}}}

     
//   }System.out.println(sum);}
//       int sum=0;
//       while(!qq.isEmpty()) {
//   	   System.out.println(sum=sum+qq.poll());}
//       }}
