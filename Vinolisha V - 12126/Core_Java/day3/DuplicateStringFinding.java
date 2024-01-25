package com.day3;

public class DuplicateStringFinding {

	public static void main(String[] args) {
	
		String string1="Vinolisha";
		int count;
		
		//Converting the string into character array
		char string[]=string1.toCharArray();
		System.out.println("The given string is "+string);
	
		System.out.println("Duplicate characters in  a string is:");
		
		
		//Count each character in the string
		
		for(int i=0; i<string.length; i++) {
			count=1;
			
			for(int j=i+1;j<string.length;j++) {
				
				if(string[i]==string[j]&&string[i]!= ' '){
					count++;
					
					//give string to 0 to avoid visited character
					string[j]='0';
				
				}
			}
			
			if(count>1 && string[i]!='0')
				System.out.println(string[i]);
		}
	}

}
