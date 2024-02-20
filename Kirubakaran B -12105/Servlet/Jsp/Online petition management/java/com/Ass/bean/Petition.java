package com.Ass.bean;

public class Petition {

	private int id;
	private String category;
	private String desc;
    private String priority;
    private String raised;
    private String assingned;
    private String status;
    
    
    
	public Petition() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Petition(int id, String category, String desc, String priority, String raised, String assingned,
			String status) {
		super();
		this.id = id;
		this.category = category;
		this.desc = desc;
		this.priority = priority;
		this.raised = raised;
		this.assingned = assingned;
		this.status = status;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}



	public String getPriority() {
		return priority;
	}



	public void setPriority(String priority) {
		this.priority = priority;
	}



	public String getRaised() {
		return raised;
	}



	public void setRaised(String raised) {
		this.raised = raised;
	}



	public String getAssingned() {
		return assingned;
	}



	public void setAssingned(String assingned) {
		this.assingned = assingned;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
    
	
    
	
}
