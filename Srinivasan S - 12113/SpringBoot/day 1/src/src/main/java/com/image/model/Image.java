package com.image.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imageId;
	private String imageName;
	private String type;
	@Lob
	@Column(name = "imageData", length = 1000000)
	private byte[] imageData;

	

//	public Image(int imageId, String imageName, String type, byte[] imageData) {
//		super();
//		this.imageId = imageId;
//		this.imageName = imageName;
//		this.type = type;
//		this.imageData = imageData;
//	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getimageName() {
		return imageName;
	}

	public void setimageName(String imageName) {
		this.imageName = imageName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

	
	
//
//	public static Object builder() {
//		// TODO Auto-generated method stub
//		return null;
//	}


	

	
}
