package com.sampleofsat.mavenday1;

public class Students {
	
	private int stuId;
		private String stuName;
		private String sCity;
		
		
		
		public Students() {
			super();
		}
	 
		public Students(int stuId, String stuName, String sCity) {
			super();
			this.stuId = stuId;
			this.stuName = stuName;
			this.sCity = sCity;
		}
	 
		public int getStuId() {
			return stuId;
		}
	 
		public void setStuId(int stuId) {
			this.stuId = stuId;
		}
	 
		public String getStuName() {
			return stuName;
		}
	 
		public void setStuName(String stuName) {
			this.stuName = stuName;
		}
	 
		public String getsCity() {
			return sCity;
		}
	 
		public void setsCity(String sCity) {
			this.sCity = sCity;
		}
	 
		@Override
		public String toString() {
			return "Student [stuId=" + stuId + ", stuName=" + stuName + ", sCity=" + sCity + "]";
		}	
	 

}
