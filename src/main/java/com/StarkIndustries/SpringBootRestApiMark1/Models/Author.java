package com.StarkIndustries.SpringBootRestApiMark1.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Genere")
    private String genere;

    public Author(int authorId, String firstName, String lastName, String genere) {

        this.authorId = authorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genere = genere;
    }

    public Author(String firstName, String lastName, String genere) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.genere = genere;
    }

    public Author() {

    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
