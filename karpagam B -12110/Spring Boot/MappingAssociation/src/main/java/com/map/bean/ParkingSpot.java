package com.map.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="parking_tbl")
public class ParkingSpot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String ParkingName;
    
	public ParkingSpot() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParkingName() {
		return ParkingName;
	}

	public void setParkingName(String parkingName) {
		ParkingName = parkingName;
	}

	@Override
	public String toString() {
		return "ParkingSpot [id=" + id + ", ParkingName=" + ParkingName + "]";
	}
	
	
    
    

}
