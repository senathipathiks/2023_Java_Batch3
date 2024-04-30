package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logindetails")
public class Login {
		@Id
		@Column(name="loginid")
		private String loginid;
		@Column(name="logpass")
		private String passwd;
		public String getLoginid() {
			return loginid;
		}
		public void setLoginid(String loginid) {
			this.loginid = loginid;
		}
		public String getPasswd() {
			return passwd;
		}
		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}
		public Login(String loginid, String passwd) {
			super();
			this.loginid = loginid;
			this.passwd = passwd;
		}
		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Login [loginid=" + loginid + ", passwd=" + passwd + "]";
		}
		
		
}
