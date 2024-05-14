package com.sblibraryapp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Librarian {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lId;
	private String lName;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Book> books;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Author> authors;

}
