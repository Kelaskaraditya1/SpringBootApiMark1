package com.StarkIndustries.SpringBootRestApiMark1.Service;

import com.StarkIndustries.SpringBootRestApiMark1.Models.Books;
import com.StarkIndustries.SpringBootRestApiMark1.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {

    @Autowired
    public BooksRepository booksRepository;

    public Books insertBooks(Books books){
        booksRepository.save(books);
        return books;
    }

    public List<Books> getBooks(){

        return booksRepository.findAll();

    }
}
