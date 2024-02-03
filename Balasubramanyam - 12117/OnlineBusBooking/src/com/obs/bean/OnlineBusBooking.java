package com.obs.bean;



public class OnlineBusBooking {
         private int BusNo; 
         private String BusName;
         private String RouteFrom;
         private String RouteTo;
         private String BusType;
         private String departure;
         private String arrival ;
         private int totalSeats;
         private int availSeats;
         private int fare ;
         public OnlineBusBooking() {
			super();
		}
         
		public OnlineBusBooking(int busNo, String busName, String routeFrom, String routeTo, String busType,
				String departure, String arrival, int totalSeats, int availSeats, int fare) {
			
			BusNo = busNo;
			BusName = busName;
			RouteFrom = routeFrom;
			RouteTo = routeTo;
			BusType = busType;
			this.departure = departure;
			this.arrival = arrival;
			this.totalSeats = totalSeats;
			this.availSeats = availSeats;
			this.fare = fare;
		}

		
		public int getBusNo() {
			return BusNo;
		}
		public void setBusNo(int busNo) {
			BusNo = busNo;
		}
		public String getBusName() {
			return BusName;
		}
		public void setBusName(String busName) {
			BusName = busName;
		}
		public String getRouteFrom() {
			return RouteFrom;
		}
		public void setRouteFrom(String routeFrom) {
			RouteFrom = routeFrom;
		}
		public String getRouteTo() {
			return RouteTo;
		}
		public void setRouteTo(String routeTo) {
			RouteTo = routeTo;
		}
		public String getBusType() {
			return BusType;
		}
		public void setBusType(String busType) {
			BusType = busType;
		}
		public String getDeparture() {
			return departure;
		}
		public void setDeparture(String departure) {
			this.departure = departure;
		}
		public String getArrival() {
			return arrival;
		}
		public void setArrival(String arrival) {
			this.arrival = arrival;
		}
		public int getTotalSeats() {
			return totalSeats;
		}
		public void setTotalSeats(int totalSeats) {
			this.totalSeats = totalSeats;
		}
		public int getAvailSeats() {
			return availSeats;
		}
		public void setAvailSeats(int availSeats) {
			this.availSeats = availSeats;
		}
		public int getFare() {
			return fare;
		}
		public void setFare(int fare) {
			this.fare = fare;
		}

		@Override
		public String toString() {
			return "OnlineBusBooking [BusNo=" + BusNo + ", BusName=" + BusName + ", RouteFrom=" + RouteFrom
					+ ", RouteTo=" + RouteTo + ", BusType=" + BusType + ", departure=" + departure + ", arrival="
					+ arrival + ", totalSeats=" + totalSeats + ", availSeats=" + availSeats + ", fare=" + fare + "]";
		}
		
         
}
