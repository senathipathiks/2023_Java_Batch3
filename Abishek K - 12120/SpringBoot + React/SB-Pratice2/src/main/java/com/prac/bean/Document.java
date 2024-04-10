package com.prac.bean;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="tbl_Document")
@Builder
@Data
public class Document {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String docName;
	private String docType;
	
	@Lob
	@Column(name = "data", columnDefinition="LONGBLOB")
	private byte[] data;

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Document(int id, String docName, String docType, byte[] data) {
		super();
		this.id = id;
		this.docName = docName;
		this.docType = docType;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	

	

	

}
