
package com.lms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lms.bean.Book;
import com.lms.Repo.BookRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class BookController {
    @Autowired
    BookRepo repo;

    @PostMapping("/CreateBook")
    public String InsertBook(@RequestBody Book book) {
        String msg = "";
        try {
            repo.save(book);
            msg = "Book Object Saved";
        } catch (Exception e) {
            msg = "Book Object not Saved";
        }
        return msg;
    }

    @PutMapping("/UpdateBook/{bookId}")
    public String updateBook(@PathVariable Integer bookId, @RequestBody Book book) {
        String msg = "";
        try {
            book.setBookId(bookId); // Ensure bookId is set
            repo.save(book);
            msg = "Book Object Updated";
        } catch (Exception e) {
            msg = "Book Object not updated";
        }
        return msg;
    }

    @DeleteMapping("/DeleteBookById/{bookId}")
    public String DeleteBook(@PathVariable("bookId") Integer bookId) {
        String msg = "";
        try {
            repo.deleteById(bookId);
            msg = "Book Object deleted";
        } catch (Exception e) {
            msg = "Book Object not deleted";
        }
        return msg;
    }

    @GetMapping("/GetBookById/{bookId}")
    public Optional<Book> getBookById(@PathVariable Integer bookId) {
        return repo.findById(bookId);
    }

    @GetMapping("/GetAllBooks")
    public List<Book> FindAllBooks() {
        return (List<Book>) repo.findAll();
    }
}
