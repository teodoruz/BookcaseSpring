package com.bookcase.bookcasesys.controllers;

import com.bookcase.bookcasesys.entities.Book;
import com.bookcase.bookcasesys.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping
    public List<Book> findAll(){
        List<Book> books = repository.findAll();
        return books;
    }

    @GetMapping(value = "/{Id}")
    public Book findById(@PathVariable Long Id){
        Book b1 = repository.findById(Id).get();
        return b1;
    }
    @PostMapping
    public Book postBook(@RequestBody Book book){
        Book book1 = repository.save(book);
        return book1;gi
    }

}
