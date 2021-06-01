package com.skc.swagger.service;

import java.util.List;

import com.skc.swagger.dao.BookRepository;
import com.skc.swagger.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public String saveBook(Book book) {
        repository.save(book);
        return "book save dwith id " + book.getBookId();
    }

    public Book getBook(int bookId) {
        return repository.findById(bookId).get();
    }

    public List<Book> removeBook(int bookId) {
        repository.deleteById(bookId);
        return repository.findAll();
    }
}
