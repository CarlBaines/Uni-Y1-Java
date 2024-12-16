/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.scedt.library.ui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import uk.ac.tees.scedt.library.Author;

/**
 *
 * @author e4092399
 */
public class AuthorTableModel extends AbstractTableModel{
    
    private String[] columnNames = { "Author Name", "DOB", "Publications" };
    private List<Author> authors;
    
    public AuthorTableModel(List <Author> authors){
        this.authors = authors;
    }
    
    
    
    
    
    
    @Override
    public int getRowCount() {
        return authors.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    public String getColumnName(int column){
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Author a = authors.get(rowIndex);
        
        return switch(columnIndex){
            case 0 -> a.getFullName();
            case 1 -> a.getDateOfBirth();
            case 2 -> a.getPublications();
            default -> null;
        };
    }
    
    
    
}
