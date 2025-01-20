package com.StarkIndustries.SpringBootRestApiMark1.Controller;

import com.StarkIndustries.SpringBootRestApiMark1.Models.Books;
import com.StarkIndustries.SpringBootRestApiMark1.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BooksController {

    @Autowired
    public BooksService booksService;

    @PostMapping("/insert")
    public ResponseEntity<Books> insertBooks(@RequestBody Books books){

        Books books1 = booksService.insertBooks(books);
        if(books1==null)
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        return ResponseEntity.status(HttpStatus.OK).body(books1);
    }

    @GetMapping("/books")
    public ResponseEntity<List<Books>> getBooks(){
        if(booksService.getBooks().isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.OK).body(booksService.getBooks());
    }

    @GetMapping("/greetings")
    public String greeting(){
        return "Greetings!!";
    }
}
