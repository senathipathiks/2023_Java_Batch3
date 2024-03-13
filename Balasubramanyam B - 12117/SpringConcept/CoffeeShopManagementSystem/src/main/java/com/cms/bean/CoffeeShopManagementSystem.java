package com.cms.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CoffeeShopManagementSystem {
	@Id
         private int id;
         private String ShopName; 
         private String Address;
         private String PhoneNo; 
         private String Email;
         private float Rating; 
         private String Proprietor ;
		public CoffeeShopManagementSystem() {
			super();
		}
		public CoffeeShopManagementSystem(int id, String shopName, String address, String phoneNo, String email,
				float rating, String proprietor) {
			super();
			this.id = id;
			ShopName = shopName;
			Address = address;
			PhoneNo = phoneNo;
			Email = email;
			Rating = rating;
			Proprietor = proprietor;
		}
		public int getid() {
			return id;
		}
		public void setid(int id) {
			this.id = id;
		}
		public String getShopName() {
			return ShopName;
		}
		public void setShopName(String shopName) {
			ShopName = shopName;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getPhoneNo() {
			return PhoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			PhoneNo = phoneNo;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public float getRating() {
			return Rating;
		}
		public void setRating(float rating) {
			Rating = rating;
		}
		public String getProprietor() {
			return Proprietor;
		}
		public void setProprietor(String proprietor) {
			Proprietor = proprietor;
		}
		@Override
		public String toString() {
			return "CoffeeShopManagementSystem = > ShopID: " + id + ", ShopName: " + ShopName + ", Address: " + Address
					+ ", PhoneNo: " + PhoneNo + ", Email: " + Email + ", Rating: " + Rating + ", Proprietor: " + Proprietor;
		}
        

}
