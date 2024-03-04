package com.javacoreday6;

interface Smile{
	default void goodSmile() {
		System.out.println("default smile");
	}
	void fakeSmile();

}
class FakeSmile implements Smile{
	public void fakeSmile() {
		System.out.println("here you with fake");
	}
}


public class DefaultSmile {
	public static void main(String[] args) {
//		public void fakeSmile() {
//			System.out.println();
//		}
//		public void goodSmile() {
//			
//		}
	}

}

