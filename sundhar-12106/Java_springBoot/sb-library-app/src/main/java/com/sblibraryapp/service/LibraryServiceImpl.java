package com.sblibraryapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sblibraryapp.entity.Author;
import com.sblibraryapp.entity.Book;
import com.sblibraryapp.repository.LibraryRepo;

@Service
@Transactional
public class LibraryServiceImpl implements LibraryService {

	private LibraryRepo lRepo;
	private AuthorService authorService;

	public LibraryServiceImpl() {
		super();

	}

	@Autowired
	public LibraryServiceImpl(LibraryRepo lRepo, AuthorService authorService) {
		super();
		this.lRepo = lRepo;
		this.authorService = authorService;
	}

	@Override
	public Book getBook(int id) {

		return lRepo.getBook(id);
	}

	@Override
	public boolean saveBook(Book book) {

		if (book != null) {
			Author author = book.getAuthor();
			System.out.println(book.getBookName());
			author = authorService.getAurthor(author.getId());
			author.getBooks().add(book);
			book.setAuthor(author);
			return lRepo.saveBook(book);
		}

		return false;
	}

	@Override
	public String updateBook(Book book) {

		if (book != null) {

			Author author = book.getAuthor();
			author = authorService.getAurthor(author.getId());
			author.getBooks().add(book);
			book.setAuthor(author);

			return lRepo.updateBook(book);
		}
		return "tech fault";
	}

	

	@Override
	public List<Book> getBookByName(String name) {

		return lRepo.getBookByName(name);
	}

	@Override
	public List<Book> getAll() {

		return lRepo.getAll();
	}

	@Override
	public List<String> getAllNames() {

		return lRepo.getAllNames();
	}

	@Override
	public boolean removeBook(int id) {
		
		System.out.println(id);
		
		if(id > 0) {
			Book book = lRepo.getBook(id);
			
			if (book != null) {
				return lRepo.removeBook(book);
			}
		}
		return false;
	}

}
