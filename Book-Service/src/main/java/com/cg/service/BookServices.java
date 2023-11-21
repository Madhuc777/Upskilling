package com.cg.service;


import com.cg.model.Book;
import com.cg.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServices {

    @Autowired
    BookRepository bookRepository;

    public void saveorUpdate(Book books) {
        bookRepository.save(books);

    }

    public Iterable<Book> listAll() {

        return this.bookRepository.findAll();

    }

    public void deleteBook(String bookId) {

        bookRepository.deleteById(bookId);

    }


    public Book getStudentByID(String bookId) {

        return bookRepository.findById(bookId).get();
    }
}