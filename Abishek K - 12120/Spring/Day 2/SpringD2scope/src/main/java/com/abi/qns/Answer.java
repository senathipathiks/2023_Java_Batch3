package com.abi.qns;

public class Answer {
	
	
	private String ans;
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(String ans) {
		super();
		this.ans = ans;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Answer [ans=" + ans + "]";
	}

	
	
	

}
