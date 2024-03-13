package com.rrs.bean;

public class RailwayReservationSystem {
	private int TrainID ;
	private String TrainName;
	private String TrainType;
	private int No_of_seats;
	private String Source ;
	private String Destination;
	private float Fare;
	public RailwayReservationSystem(){
		super();
	}
	public RailwayReservationSystem(int trainID, String trainName, String trainType, int no_of_seats, String source,
			String destination, float fare) {
		super();
		TrainID = trainID;
		TrainName = trainName;
		TrainType = trainType;
		No_of_seats = no_of_seats;
		Source = source;
		Destination = destination;
		Fare = fare;
	}
	public int getTrainID() {
		return TrainID;
	}
	public void setTrainID(int trainID) {
		TrainID = trainID;
	}
	public String getTrainName() {
		return TrainName;
	}
	public void setTrainName(String trainName) {
		TrainName = trainName;
	}
	public String getTrainType() {
		return TrainType;
	}
	public void setTrainType(String trainType) {
		TrainType = trainType;
	}
	public int getNo_of_seats() {
		return No_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		No_of_seats = no_of_seats;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public float getFare() {
		return Fare;
	}
	public void setFare(float fare) {
		Fare = fare;
	}
	
}
