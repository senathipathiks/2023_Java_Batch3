package com.sblibraryapp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sblibraryapp.controller.AuthorController;
import com.sblibraryapp.entity.Author;
import com.sblibraryapp.entity.Book;

@SpringBootTest
class SbAuthorTest {

	@Autowired
	private AuthorController controller;

	@Disabled
	@Test
	void testGetAllAuthor() {
		List<Author> ls = controller.getAll();

		assertThat(ls).isNotNull();
	}

	@Disabled
	@Test
	void testGetAllNames() {
		List<String> ls = controller.getAllNames();

		assertThat(ls).isNotNull();
	}

	@Disabled
	@Test
	void testSaveAuthor() {

		Author author = new Author();
		author.setAuthorName("srini");
		author.setEmail("srini@gmail.com");

		Book book = new Book();
		book.setbId(5);

		ArrayList<Book> ls = new ArrayList<>();
		ls.add(book);

		boolean result = controller.saveAuthor(author);
		System.out.println(result);

		assertThat(result).isTrue();
	}

	@Test
	void testUpdateAuthor() {

		Author author = new Author();
		author.setId(10);
		author.setAuthorName("prasanth");
		author.setEmail("prasanth@gmail.com");

		Book book = new Book();
		book.setBookName("bangam memez");
		book.setBookPrice(499);

		Set<Book> ls = new HashSet<>();
		ls.add(book);
		
		author.setBooks(ls);

		String result = controller.updateAuthor(author);
		System.out.println(result);

		assertThat(result).isEqualTo("updated successfully...!");
		
	}

}
