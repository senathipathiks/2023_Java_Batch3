package com.sblibraryMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Entity
@Setter
@Getter
@AllArgsConstructor
public class Library {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lId;
	private String lName;
	
}
