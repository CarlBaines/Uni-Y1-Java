/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.scedt.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import uk.ac.tees.scedt.library.Author;
import uk.ac.tees.scedt.library.Book;

/**
 *
 * @author steven
 */
public class TestHarness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Author> authors = createAuthorList();
        List<Book> books = createBookList(authors);
        
        for(Book b : books) {
            System.out.println(String.format("Title: %s has %d author(s).", b.getTitle(), b.getAuthors().size()));
            
            for(Author a : b.getAuthors()) {
                System.out.println(String.format("\t%s", a.getFullName()));
            }
        }
    }
    
    private static List<Author> createAuthorList() {
        Author terryPratchett = new Author("Terry", 
                "Pratchett", 
                LocalDate.parse("1948-04-28"));
        
        Author ianStewart = new Author("Ian", 
                "Stewart", 
                LocalDate.parse("1945-09-24"));

        return Arrays.asList(terryPratchett, ianStewart);
    }
    
    private static List<Book> createBookList(List<Author> authors) {
        // Create a book authored by Terry Pratchett and Ian Stewart
        Book theScienceOfDiscWorld = new Book(416, 
                "0091951704", 
                "The Science of Discworld", 
                LocalDate.parse("2013-04-11"));
        
        // add authors to the book...
        theScienceOfDiscWorld.addAuthor(authors.get(0));
        theScienceOfDiscWorld.addAuthor(authors.get(1));
        
        // add publication to the authors
        authors.get(0).addPublication(theScienceOfDiscWorld);
        authors.get(1).addPublication(theScienceOfDiscWorld);
        
        // Create a book only authored by Terry Pratchett
        Book theColourOfMagic = new Book(288, 
                "0552166596", 
                "The Colour of Magic", 
                LocalDate.parse("2012-06-21"));
        
        // add author to the book...
        theColourOfMagic.addAuthor(authors.get(0));
        
        // add publication to the author
        authors.get(0).addPublication(theColourOfMagic);
        
        return new ArrayList(
                Arrays.asList(theScienceOfDiscWorld, theColourOfMagic));
    }

}
