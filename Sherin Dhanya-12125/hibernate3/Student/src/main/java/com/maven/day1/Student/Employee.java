package com.maven.day1.Student;

public class Employee {
	
		private int empid;
		private String empname;
		private String department;
		/**
		 * @param empid
		 * @param empname
		 * @param department
		 */
		public Employee(int empid, String empname, String department) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.department = department;
		}
		/**
		 * 
		 */
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", empname=" + empname + ", department=" + department + "]";
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		
}
