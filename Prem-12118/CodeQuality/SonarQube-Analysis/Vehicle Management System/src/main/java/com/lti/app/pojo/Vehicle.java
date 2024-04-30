package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle01")
public class Vehicle 
{
		@Id
		@Column(name="vehicleid")
		private String vid;
		@Column(name="vehiclename")
		private String vname;
		@Column(name="vehicletype")
		private String type;
		@Column(name="manufacturedby")
		private String manufac;
			
		public Vehicle() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "Vehicle [vid=" + vid + ", vname=" + vname + ", type=" + type + ", manufac=" + manufac + "]";
		}

		public Vehicle(String vid, String vname, String type, String manufac) {
			super();
			this.vid = vid;
			this.vname = vname;
			this.type = type;
			this.manufac = manufac;
		}

		public String getVid() {
			return vid;
		}
		public void setVid(String vid) {
			this.vid = vid;
		}
		public String getVname() {
			return vname;
		}
		public void setVname(String vname) {
			this.vname = vname;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getManufac() {
			return manufac;
		}
		public void setManufac(String manufac) {
			this.manufac = manufac;
		}
		
		
		
}
