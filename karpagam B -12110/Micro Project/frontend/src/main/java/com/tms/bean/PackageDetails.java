package com.tms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "packageDetails_tbl")
public class PackageDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int packageId;
	private String packageName;
	private String destinationPlace;
	private String price;
	private String description;
	private String duration;
	private String packageType;
	private String travelMode;
	
	private String personsAlllowed;

	@Lob
	@Column(length = 1000000)
	private byte[] destImage;

	public PackageDetails() {
		super();
	}

	public PackageDetails(int packageId, String packageName, String destinationPlace, String price, String description,
			String duration, String packageType, String travelMode, String personsAlllowed, byte[] destImage) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.destinationPlace = destinationPlace;
		this.price = price;
		this.description = description;
		this.duration = duration;
		this.packageType = packageType;
		this.travelMode = travelMode;
		this.personsAlllowed = personsAlllowed;
		this.destImage = destImage;
	}

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getDestinationPlace() {
		return destinationPlace;
	}

	public void setDestinationPlace(String destinationPlace) {
		this.destinationPlace = destinationPlace;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getPersonsAlllowed() {
		return personsAlllowed;
	}

	public void setPersonsAlllowed(String personsAlllowed) {
		this.personsAlllowed = personsAlllowed;
	}

	public String getTravelMode() {
		return travelMode;
	}

	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}

	public byte[] getDestImage() {
		return destImage;
	}

	public void setDestImage(byte[] destImage) {
		this.destImage = destImage;
	}

	@Override
	public String toString() {
		return "PackageDetails [packageId=" + packageId + ", packageName=" + packageName + ", destinationPlace="
				+ destinationPlace + ", price=" + price + ", description=" + description + ", duration=" + duration
				+ ", packageType=" + packageType + ", personsAlllowed=" + personsAlllowed + "]";
	}

}
