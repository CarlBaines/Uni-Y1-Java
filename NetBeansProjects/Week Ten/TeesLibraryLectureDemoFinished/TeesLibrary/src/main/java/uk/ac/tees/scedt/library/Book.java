/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.scedt.library;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author steven
 */
public class Book implements Comparable<Book> {
    private int numOfPages;
    private String title;
    private String isbn;
    private LocalDate publicationDate;
    // ... other relevant instance variables ...
    
    private ArrayList<Author> authors = new ArrayList<>();

    public Book(int numOfPages, String isbn, String title, LocalDate pubDate) {
        this.numOfPages = numOfPages;
        this.isbn = isbn;
        this.title = title;
        publicationDate = pubDate;
    }
        
    public void addAuthor(Author author) {
        authors.add(author);
    }
    
    public String getIsbn() {
        return isbn;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public int compareTo(Book otherBook) {
        // compare this book and the other book's publication dates
        return this.publicationDate.compareTo(otherBook.publicationDate);
    }
    
    @Override
    public String toString() {
        return String.format("Title: %s -- Pages: %d -- ISBN: %s -- Publication Date: %s", title, numOfPages, isbn, publicationDate.format(DateTimeFormatter.ISO_DATE));
    }
}
