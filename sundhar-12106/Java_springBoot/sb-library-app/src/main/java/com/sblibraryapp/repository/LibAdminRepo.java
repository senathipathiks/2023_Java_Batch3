package com.sblibraryapp.repository;

import java.util.List;

import com.sblibraryapp.entity.Librarian;

public interface LibAdminRepo {
	
	List<Librarian> getAll();
	
	Librarian getById(int id);

}
