package com.cg.controller;


import com.cg.model.Book;
import com.cg.service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("Books")
public class BookController {

@Autowired

private  BookServices bookServices;
 @PostMapping(value ="/save" )
    public   String saveStudent(@RequestBody Book books)
 {
     bookServices.saveorUpdate(books);
     return books.getBookId();

 }

    @GetMapping(value ="/getAll" )
    public  Iterable<Book>getBooks()
    {

        return bookServices.listAll();

    }

    @PutMapping(value ="/edit/{bookId}" )
    private   Book update(@RequestBody Book book,@PathVariable(name = "bookId")String bookId)
    {
       book.setBookId(bookId);

       bookServices.saveorUpdate(book);
       return  book;

    }
    @DeleteMapping(value ="/delete/{bookId}" )
            private  void  deleteBook(@PathVariable(name="bookId")String bookId)
     {
         bookServices.deleteBook(bookId);
         ;


    }

    @RequestMapping("/book/{bookId}")
    private  Book getBooks(@PathVariable(name = "bookId") String bookId)
    {
        return bookServices.getStudentByID(bookId);
    }



}
