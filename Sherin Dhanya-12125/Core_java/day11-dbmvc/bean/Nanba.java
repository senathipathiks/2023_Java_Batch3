package com.sms.bean;
// in bean use getter and setter & constructor using super class & generate tostring
public class Nanba {

	
		
		private String department;
		private String category;
		private int mobileno;
		private String location;
		private String priority;
		
		public Nanba(String department, String category, int mobileno, String location, String priority) {
			super();
			this.department = department;
			this.category = category;
			this.mobileno = mobileno;
			this.location = location;
			this.priority = priority;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public int getMobileno() {
			return mobileno;
		}

		public void setMobileno(int mobileno) {
			this.mobileno = mobileno;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getPriority() {
			return priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		
}