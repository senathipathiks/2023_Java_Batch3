package com.abi.qns;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int qid;
	private String qname;
	private Map<Answer, User> qns;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qid, String qname, Map<Answer, User> qns) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.qns = qns;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public Map<Answer, User> getQns() {
		return qns;
	}
	public void setQns(Map<Answer, User> qns) {
		this.qns = qns;
	}
	
	void display() {
		
		System.out.println("Qns ID: "+qid);
		System.out.println("Qns Name: "+qname);
		
		Set<Entry<Answer, User>> set  = qns.entrySet();
		Iterator<Entry<Answer, User>> itr = set.iterator();
		
		while(itr.hasNext()) {
			
		Entry<Answer, User>	entry = itr.next();
		
		Answer ans = entry.getKey();
		User usr = entry.getValue();
		
		System.out.println("Answer: "+ans.getAns());
		System.out.println("Posted By: "+usr.getUname());
		}
	}

}
