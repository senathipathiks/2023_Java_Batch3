package com.sblibraryapp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatList;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.sblibraryapp.controller.LibraryController;
import com.sblibraryapp.entity.Author;
import com.sblibraryapp.entity.Book;

@SpringBootTest
class SbLibraryAppApplicationTests {

	@Autowired
	private LibraryController controller;

	@Test
	void testGetAll() {
		List<Book> lb = controller.getAll();
		assertThatList(lb).asList();
	}

	@Test
	void testTetById() {

		Book book = controller.getById(118);

		assertThat(book).isNotNull();

	}

	@Test
	void testSaveBook() {

		Book book = new Book();
		book.setBookName("hemz");
		book.setBookPrice(120.90);

		Author author = new Author();
		author.setId(5);

		book.setAuthor(author);

		boolean result = controller.saveBook(book);
		assertThat(result).isTrue();

	}
	
	@Test
	void testGetNames() {
		ResponseEntity<List<String>> lb = controller.getAllNames();
		assertThatList(lb.getBody()).asList();
	}
	
	

}
