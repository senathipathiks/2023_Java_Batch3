package com.day6.HQLExamples;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HQLTable")
public class Employee4 {
	



	

		@Id
		private int empid;
		private String empname;
        private int dept;
	
		


		public Employee4() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee4(int empid, String empname, int  dept) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.dept = dept;
		}

		public int getempid() {
			return empid;
		}

		public void setempid(int empid) {
			this.empid = empid;
		}

		public String getempname() {
			return empname;
		}

		public void setempname(String empname) {
			this.empname = empname;
		}

		public int getDept() {
			return dept;
		}

		public void setDept(int dept) {
			this.dept = dept;
		}

		@Override
		public String toString() {
			return "Employee4 [empid=" + empid + ", empname=" + empname + ", dept=" + dept + "]";
		}


		
	


}
