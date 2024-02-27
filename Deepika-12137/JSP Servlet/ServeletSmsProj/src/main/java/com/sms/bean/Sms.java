package com.sms.bean;

public class Sms {

	     
		private int SId;
		private String SName;
		private String SCity;
		
		
		
		public Sms() {
			super();
		}

		public Sms(int SId,String SName,String SCity){
			
			this.SId=SId;
			this.SName=SName;
			this.SCity=SCity;
			
		}

		public int getSId() {
			return SId;
		}

		public void setSId(int sId) {
			SId = sId;
		}

		public String getSName() {
			return SName;
		}

		public void setSName(String sName) {
			SName = sName;
		}

		public String getSCity() {
			return SCity;
		}

		public void setSCity(String sCity) {
			SCity = sCity;
		}

}
