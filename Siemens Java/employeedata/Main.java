package employeedata;

import employeedata.Employee;

import java.util.ArrayList;

import employeedata.Developer;

public class Main {

    public static void main(String[] args) {
        
        Developer d1 = new Developer(22, "Nikhil", "Software engineer", "Railway", 50000.12f, 12345);
        
        System.out.println(d1.getEmployeeAge());

        d1.setEmployeeName("rohan");

        System.out.println("After change: " +d1);
    }
    
}
