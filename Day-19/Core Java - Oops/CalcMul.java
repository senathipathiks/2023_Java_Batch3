package com.newclass;

public class CalcMul {
	
	 void mul(int v1, int v2) {
		int m = v1 * v2;
		
		System.out.println(m);
	}
	
	void mul(float v1, float v2) {
		float m = v1 * v2;
		System.out.println(m);
	}
	
	void mul(int v1, float v2) {
		float m = v1 * v2;
		System.out.println(m);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcMul c = new CalcMul ();
                 c.mul(5,5.0f);
	}

}


