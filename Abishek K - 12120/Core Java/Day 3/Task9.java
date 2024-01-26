//generate a pin where pin should contain last three characters of your firstname ,middle three characters of your middle name 
 //        followed by the last four numbers of your aadhar number and then first three characters of your firstname.
package com.day3;

public class Task9 {

	public static void main(String[] args) {
		String fname="Abishek";
		String mname="Abi";
		String lname="kumar";
		String adhar="123456789";
		
		
		String fname1=fname.substring(4, 7);
		System.out.println(fname1);
		String mname1=mname.substring(0, 3);
		System.out.println(mname1);
		String adhar1=adhar.substring(5);
		System.out.println(adhar1);
		String fname2=fname.substring(0, 3);
		System.out.println(fname2);
		
		String pin= fname1.concat(mname1);
		String pin1=pin.concat(adhar1);
		String pin2=pin1.concat(fname2);
		System.out.println("Final Pin Generator is: "+pin2);
		
		
	}

}
