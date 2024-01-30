package Day_5;

class Threadd extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
	        System.out.println("Thread-1");
	        }
	    
	    }
	}
	class Threaddd extends Threadd{
	    public void run() {
	        for(int i=0;i<10;i++) {
	            System.out.println("Thread-2");
	        }
	    }
	}
	
	
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Threadd th1=new Threadd();
	        Thread th2=new Threaddd();
	        th1.start();
	        th2.start();


	}

}
