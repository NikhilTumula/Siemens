import javax.swing.plaf.basic.BasicSpinnerUI;

import employeeportal.Employee;
import employeeportal.Gender;
import salaryportal.EmployeeAddress;
import salaryportal.ManagerEmployee;
import salaryportal.SalariedEmployee;
import salaryportal.SalaryComponent;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Nikhil", 22,Gender.MALE, "Graduate Trainee", 50000);
        Employee e2 = new Employee("Vishnu", 22, Gender.MALE, "Sr.Developer", 50000.00f);
        Employee e3 = new Employee("Vipul", 22, Gender.MALE, "Data Scientist", 60000.00f);
        Employee e4 = new Employee("Reshmanth", 22, Gender.MALE, "Software Engineer", 40000.00f);
        Employee e5 = new Employee("Pavan", 22, Gender.MALE, "Engineer", 40000.02f);
        Employee e6 = new Employee("Harshit", 26, Gender.MALE, "Sr.Trainer", 70000.00f);
        

        System.out.println(e1.getEmployeeName()); // fetch
    
        e1.setEmployeeName("Ryan Dsuzu"); //modify

        System.out.println("After change: " + e1);


        EmployeeAddress E1 = new EmployeeAddress("banerroad", 411057, "Maharastra");
        SalaryComponent S1 = new SalaryComponent(50000, 0.16f, 0.16f);
        ManagerEmployee M1 = new ManagerEmployee("1234", "Nikhil", "developer", S1, E1 , 8);
        M1.calculateTax();


    }   
}
