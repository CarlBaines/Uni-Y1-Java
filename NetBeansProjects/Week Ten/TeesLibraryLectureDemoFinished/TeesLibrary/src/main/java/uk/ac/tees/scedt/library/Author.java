/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.scedt.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author steven
 */
public class Author {
    private String fname;
    private String lname;
    private LocalDate dateOfBirth;
    // ... other relevant instance variables ...
    
    private HashMap<String, Book> publications = new HashMap<>();

    public Author(String fname, String lname, LocalDate dateOfBirth) {
        this.fname = fname;
        this.lname = lname;
        this.dateOfBirth = dateOfBirth;
    }
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    
    public String getFullName() {
        return fname + " " + lname;
    }
    
    public void addPublication(Book book) {
        publications.put(book.getIsbn(), book);
    }
    
    public ArrayList<Book> getPublications() {
        // Iterative solution to generate a list from the value
        ArrayList<Book> list = new ArrayList<>();
        
        for(Book b : publications.values()) {
            list.add(b);
        }
        
        // Sort the publications by their date
        Collections.sort(list);
        
        return list;
    }
}
