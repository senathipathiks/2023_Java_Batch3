package com.user_details.bean;

public class Customer {
	private int uid;
    private String uname;
    
    public Customer(){
        super();
    }

    public Customer(int uid, String uname) {
        super();
        this.uid = uid;
        this.uname = uname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    


}
