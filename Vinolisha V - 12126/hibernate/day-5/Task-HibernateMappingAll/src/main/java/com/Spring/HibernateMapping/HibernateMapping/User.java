package com.Spring.HibernateMapping.HibernateMapping;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table
public class User {
	
	@Id
		private int id;
		private String name;
		
		@OneToOne(targetEntity = Address.class, cascade = {CascadeType.ALL})
		private Address address;
		
		@ManyToMany(targetEntity = Vehicle.class, cascade = CascadeType.ALL)
		List<Vehicle> vehicle = new ArrayList();
		
		public User() {
			super();
			
		
		}

		public User(int id, String name, Address address, List<Vehicle> vehicle) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.vehicle = vehicle;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public List<Vehicle> getVehicle() {
			return vehicle;
		}

		public void setVehicle(List<Vehicle> vehicle) {
			this.vehicle = vehicle;
		}

		

		
}


