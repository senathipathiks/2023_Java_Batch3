package com.day2.webappmaven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
	@Table(name="Register")
    
	public class Registration {
		@Id // to set primary key
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		@Column(name="username")
		private String username;
		@Column(name="Password")
		private String Password;
		
		public Registration() {
			super();
			
		}
		public Registration(String username, String password) {
			super();
			this.username = username;
			Password = password;
		}
		


		public String getUsername() {
			return username;
		}



		public void setUsername(String username) {
			this.username = username;
		}



		public String getPassword() {
			return Password;
		}



		public void setPassword(String password) {
			Password = password;
		}
	     @Override
		public String toString() {
			return "Register [id=" + id + ", username=" + username + ", Password=" + Password + "]";
		}
		

	}



