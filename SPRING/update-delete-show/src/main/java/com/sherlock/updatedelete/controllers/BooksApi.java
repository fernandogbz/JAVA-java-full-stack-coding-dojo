package com.sherlock.updatedelete.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.sherlock.updatedelete.models.Book;
import com.sherlock.updatedelete.services.BookService;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class BooksApi {
    private final BookService bookService;
    public BooksApi(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }

    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String description, @RequestParam(value="language") String language, @RequestParam(value="numberOfPages") Integer numberOfPages) {
        Book book = new Book(title, description, language, numberOfPages);
        return bookService.createBook(book);
    }

    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }

    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="numberOfPages") Integer numOfPages) {
        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}
