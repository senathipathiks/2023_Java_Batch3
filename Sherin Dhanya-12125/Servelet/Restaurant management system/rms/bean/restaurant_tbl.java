package com.rms.bean;

public class restaurant_tbl {

	    private int RestId;
	    private String RestName;
	    private String RestType;
	    private String Address;
	    private int PhoneNo;
	    private String Email;
	    private int Rating;

		public restaurant_tbl(int restId, String restName, String restType, String address, int phoneNo, String email,
				int Rating, String proprietor) {
			super();
			RestId = restId;
			RestName = restName;
			RestType = restType;
			Address = address;
			PhoneNo = phoneNo;
			Email = email;
			Rating = Rating;
			Proprietor = proprietor;
		}


		private String Proprietor;
	    
	    
	    public restaurant_tbl() {
	        super();
	    }


		public int getRestId() {
			return RestId;
		}


		public void setRestId(int restId) {
			RestId = restId;
		}


		public String getRestName() {
			return RestName;
		}


		public void setRestName(String restName) {
			RestName = restName;
		}


		public String getRestType() {
			return RestType;
		}


		public void setRestType(String restType) {
			RestType = restType;
		}


		public String getAddress() {
			return Address;
		}


		public void setAddress(String address) {
			Address = address;
		}


		public int getPhoneNo() {
			return PhoneNo;
		}


		public void setPhoneNo(int phoneNo) {
			PhoneNo = phoneNo;
		}


		public String getEmail() {
			return Email;
		}


		public void setEmail(String email) {
			Email = email;
		}


		public int getRating() {
			return Rating;
		}


		public void setRating(int rating) {
			Rating = rating;
		}


		public String getProprietor() {
			return Proprietor;
		}


		public void setProprietor(String proprietor) {
			Proprietor= proprietor;
		}
}
