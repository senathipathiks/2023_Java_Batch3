package com.java3;
import java.util.Stack;

public class RemoveDuplicateStackElement {
	// to remove repeated stack elements

public static void main(String[] args) {
		
			Stack<Integer> duplicate=new Stack<Integer>();
	        duplicate.push(100);
	        duplicate.push(150);
	        duplicate.push(370);
	        duplicate.push(98);
	        duplicate.push(100);
	        duplicate.push(50);
	        duplicate.push(150);
	        duplicate.push(100);
			
			System.out.println("Stack : "+duplicate);
			
			for (int i = 0; i < duplicate.size(); i++) {
				for (int j = i+1; j < duplicate.size(); j++) {
					if (duplicate.get(i)==duplicate.get(j)) {
						duplicate.remove(j);//using remove to remove duplicates in stack.remove().
					}
				}
			}
			System.out.println("After Removing Duplicate : "+duplicate);

		}

	}


