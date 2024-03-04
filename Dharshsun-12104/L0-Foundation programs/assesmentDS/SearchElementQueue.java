package com.assesmentDS;
import java.util.LinkedList;
import java.util.Queue;

public class SearchElementQueue {
	public static void main(String args[]) {
	Queue<Integer> queue = new LinkedList<>();//implementing queue using linkedlist.
	//adding elements in queue.
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    System.out.println(queue);
    //removing a element
    queue.remove(5);
    System.out.println(queue);
    
    
//search for a element
    int elementToSearch = 3;
    boolean isElementFound = queue.contains(elementToSearch);//using queue.contains to find element is found or not.
    if (isElementFound) {
        System.out.println("Element " + elementToSearch + " found in the Queue.");
    } else {
        System.out.println("Element " + elementToSearch + " not found in the Queue.");
    }
}
}

 

