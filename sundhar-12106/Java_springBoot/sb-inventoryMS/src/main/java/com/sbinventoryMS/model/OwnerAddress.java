package com.sbinventoryMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OwnerAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aId;
	private int doorNo;
	private String streetName;
	private String city;
	private long pincode;
	

}
