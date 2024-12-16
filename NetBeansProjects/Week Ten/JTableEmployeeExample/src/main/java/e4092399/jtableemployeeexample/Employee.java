/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.jtableemployeeexample;

import java.time.LocalDate;

/**
 *
 * @author e4092399
 */
public class Employee {
    private static int employeeCount = 0;
    
    private String name;
    private Department department;
    private LocalDate dateJoined;
    private int employeeNumber;
    
    public Employee(String name, Department department, LocalDate dateJoined){
        this.name = name;
        this.department = department;
        this.dateJoined = dateJoined;
        employeeNumber = ++employeeCount;
    }
    
    public String getName(){
        return name;
    }
    
    public Department getDepartment(){
        return department;
    }
    
    public LocalDate getDateJoined(){
        return dateJoined;
    }
    
    public int getEmployeeNumber(){
        return employeeNumber;
    }
    
}
