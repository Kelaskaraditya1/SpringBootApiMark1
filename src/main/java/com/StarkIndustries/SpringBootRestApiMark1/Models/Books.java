package com.StarkIndustries.SpringBootRestApiMark1.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column(name = "Name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Author author;

    public Books(int bookId, String name, Author author) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
    }

    public Books(String name,Author author){
        this.name=name;
        this.author=author;
    }

    public Books(){

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
