package com.Day1Oops;
public class StudentMarkCal {
	    private int m1,m2,m3,tot;
	    private double avg;
	    private String grade;
	    
	    StudentMarkCal(int m1,int m2,int m3)
	    {
	    	this.m1=m1;
	    	this.m2=m2;
	    	this.m3=m3;
	    	
	    	
	    }
	    public int Add() {
	    	 tot = m1 + m2 + m3;   
		        return tot;
	    }
	    public double Avg()
	    {   
	        avg = tot/3;   
	        return avg;
	    }
	    
	    public String Grade()
	    {
	    	
	    
	        if(avg > 40)
	        {
	            grade = "Pass";
	        }
	        else
	        {
	            grade = "Fail";
	        }
	       
	        return grade;
	    }
	
	public static void main(String[] args) {
		
		 StudentMarkCal s1 = new StudentMarkCal(50,50,50);
		 System.out.println(s1.Add());
		 System.out.println(s1.Avg());
		 System.out.println(s1.Grade());
		
		
	}

}
