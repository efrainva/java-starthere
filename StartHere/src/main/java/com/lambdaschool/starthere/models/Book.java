package com.lambdaschool.starthere.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

    private long bookid;

    private String booktittle;

    private String ISBN;

    private int copy;

    public Book (){}

    public Book(String booktittle, String ISBN,int copy){
        this.booktittle = booktittle;
        this.ISBN = ISBN;
        this.copy = copy;
    }

    public String getBooktittle() {
        return booktittle;
    }

    public void setBooktittle(String booktittle) {
        this.booktittle = booktittle;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCopy() {
        return copy;
    }

    public void setCopy(int copy) {
        this.copy = copy;
    }
}
