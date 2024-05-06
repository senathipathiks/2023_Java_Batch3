package com.elbs.model;

import org.springframework.context.annotation.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Configuration
@Entity
@Table(name = "TariffTable")
public class Tariff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tariffId;
	private String tariffCategory;
	private int tariffAmount;
	private String tariffStatus;
	public Tariff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tariff(int tariffId, String tariffCategory, int tariffAmount, String tariffStatus) {
		super();
		this.tariffId = tariffId;
		this.tariffCategory = tariffCategory;
		this.tariffAmount = tariffAmount;
		this.tariffStatus = tariffStatus;
	}
	public int getTariffId() {
		return tariffId;
	}
	public void setTariffId(int tariffId) {
		this.tariffId = tariffId;
	}
	public String getTariffCategory() {
		return tariffCategory;
	}
	public void setTariffCategory(String tariffCategory) {
		this.tariffCategory = tariffCategory;
	}
	public int getTariffAmount() {
		return tariffAmount;
	}
	public void setTariffAmount(int i) {
		this.tariffAmount = tariffAmount;
	}
	public String getTariffStatus() {
		return tariffStatus;
	}
	public void setTariffStatus(String tariffStatus) {
		this.tariffStatus = tariffStatus;
	}
	
	
	
	

}
