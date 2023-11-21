package com.cg.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection ="Book")

public class Book {

    @Id
    private String bookId;

    private String bookName;

    private String authorName;

    private String bookDescription;


    public Book() {
    }

    public Book(String bookId, String bookName, String authorName, String bookDescription) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookDescription = bookDescription;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                '}';
    }
}


