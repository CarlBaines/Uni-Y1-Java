/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.library.ui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import uk.ac.tees.scedt.library.Book;

/**
 *
 * @author u0012604
 */
public class BookTableModel extends AbstractTableModel {
    
    private String[] columnNames = { "Title", "ISBN", "Publishcation Date", "No. of Pages", "No. of Authors" };
    private List<Book> books;

    public BookTableModel(List<Book> books) {
        this.books = books;
    }
    
   
    @Override
    public int getRowCount() {
        return books.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book b = books.get(rowIndex);
        
        return switch(columnIndex) {
            case 0 -> b.getTitle();
            case 1 -> b.getIsbn();
            case 2 -> b.getNumOfPages();
            case 3 -> b.getPublicationDate();
            case 4 -> b.getAuthors().size();
            default -> null;
        };
    }
    
}
