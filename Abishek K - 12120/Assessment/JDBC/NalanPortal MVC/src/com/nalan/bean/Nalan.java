package com.nalan.bean;

import com.nalan.dao.*;
public class Nalan {
	
	private int ticid;
	private String ticby;
	private String ticto;
	private String ticstatus;
	
	public Nalan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nalan(int ticid, String ticby, String ticto, String ticstatus) {
		super();
		this.ticid = ticid;
		this.ticby = ticby;
		this.ticto = ticto;
		this.ticstatus = ticstatus;
	}

	public int getTicid() {
		return ticid;
	}

	public void setTicid(int ticid) {
		this.ticid = ticid;
	}

	public String getTicby() {
		return ticby;
	}

	public void setTicby(String ticby) {
		this.ticby = ticby;
	}

	public String getTicto() {
		return ticto;
	}

	public void setTicto(String ticto) {
		this.ticto = ticto;
	}

	public String getTicstatus() {
		return ticstatus;
	}

	public void setTicstatus(String ticstatus) {
		this.ticstatus = ticstatus;
	}
	
	
	

}
