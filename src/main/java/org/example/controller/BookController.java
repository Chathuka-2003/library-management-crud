package org.example.controller;

import org.example.model.dto.BookDTO;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public List<BookDTO> getAll(){
        return bookService.getAll();
    }
    @GetMapping("/{isbn}")
    public BookDTO findByIsbn(@PathVariable Long isbn){
        return bookService.searchByID(isbn);
    }
    @PostMapping
    public void add(@RequestBody BookDTO bookDTO){
        bookService.add(bookDTO);
    }
    @DeleteMapping("/{isbn}")
    public void delete(@PathVariable Long isbn){
        bookService.delete(isbn);
    }
    @PutMapping
    public void update(@RequestBody BookDTO bookDTO){
        bookService.update(bookDTO);
    }
}
