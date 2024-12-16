/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.jtableemployeeexample.gui;


import e4092399.jtableemployeeexample.Employee;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author e4092399
 */
public class EmployeeTableModel extends AbstractTableModel {
    
    private static String[] COLUMN_NAMES = {"Name", "Department", "Date Joined", "Employee Number"};
    private List<Employee> employees;
    
    public EmployeeTableModel(List<Employee> employees){
        this.employees = employees;
    }
    
    @Override
    public int getRowCount() {
        return employees.size(); 
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee employee = employees.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return employee.getName();
            case 1:
                return employee.getDepartment();
            case 2:
                return employee.getDateJoined();
            case 3:
                return employee.getEmployeeNumber();
        }
        return null;
    }
    
}
