package com.day6adv;
class Thread1 extends Thread{
    
    @Override
    public void run() {
        for (int i = 0; i <3; i++) {
        System.out.println("Cr7");
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException i1) {
            i1.printStackTrace();
        }
        }
    }
}
class Thread2 extends Thread{
    
    @Override
    public void run() {
        for (int i = 0; i <3; i++) {
        System.out.println("Leo");
        }
    }
}
class Thread3 extends Thread{
    
    @Override
    public void run() {
        for (int i = 0; i <3; i++) {
        System.out.println("Serigo");
        }
    }
}
public class MultiThreading {
public static void main(String[] args) {
    
    Thread1 thread1=new Thread1();
    
    thread1.start();
    Thread2 thread2=new Thread2();
    thread2.start();
    Thread3 thread3 = new Thread3();
    thread3.start();
    thread1.setPriority(10);
    System.out.println(thread1.getPriority());
    System.out.println(thread3.getPriority());
}
}