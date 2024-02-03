package com.hrs.bean;

public class HotelRoomReservationSystem {
	private int RoomID;
	private String RoomType;
	private int RoomTariff;
	private String RoomDesc;
	private String Occupancy;
	public HotelRoomReservationSystem() {
		super();
	}
	public HotelRoomReservationSystem(int roomID, String roomType, int roomTariff, String roomDesc, String occupancy) {
		super();
		RoomID = roomID;
		RoomType = roomType;
		RoomTariff = roomTariff;
		RoomDesc = roomDesc;
		Occupancy = occupancy;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	public String getRoomType() {
		return RoomType;
	}
	public void setRoomType(String roomType) {
		RoomType = roomType;
	}
	public int getRoomTariff() {
		return RoomTariff;
	}
	public void setRoomTariff(int roomTariff) {
		RoomTariff = roomTariff;
	}
	public String getRoomDesc() {
		return RoomDesc;
	}
	public void setRoomDesc(String roomDesc) {
		RoomDesc = roomDesc;
	}
	public String getOccupancy() {
		return Occupancy;
	}
	public void setOccupancy(String occupancy) {
		Occupancy = occupancy;
	}
	@Override
	public String toString() {
		return "HotelRoomReservationSystem [RoomID=" + RoomID + ", RoomType=" + RoomType + ", RoomTariff=" + RoomTariff
				+ ", RoomDesc=" + RoomDesc + ", Occupancy=" + Occupancy + "]";
	}
	
	

}
