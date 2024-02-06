package com.day8;


class Thread1 extends Thread{
	
	public synchronized void run() { // Sync in Method 
		
		System.out.println("It is the Method thread in Sync");
		
	}
	
}


class Thread2 extends Thread{
	
	public void run(){
	
	synchronized(this) { // Sync in Block
		
		
		System.out.println("It is the BLock thread in Sync");
		
	}
	
	}
	
}


class Thread3 extends Thread{
	
	static synchronized void display() {
		
	     System.out.println("Static method thread");
		
	}
	
	
}


public class SyncEx {

	public static void main(String[] args) {
		
 
		
		
	}

}
