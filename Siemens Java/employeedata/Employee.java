package employeedata;

public class Employee {
    private int employeeAge;
    private String employeeName;
    private String employeeDesignation;
    private String employeeDepartment;
    private float employeeSalary;


    public Employee(int employeeAge, String employeeName, String employeeDesignation, String employeeDepartment, float employeeSalary) {
        this.employeeAge = employeeAge;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
    }


    public int getEmployeeAge() {
        return this.employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return this.employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeDepartment() {
        return this.employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public float getEmployeeSalary() {
        return this.employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }


    @Override
    public String toString() {
        return "{" +
            " employeeAge='" + getEmployeeAge() + "'" +
            ", employeeName='" + getEmployeeName() + "'" +
            ", employeeDesignation='" + getEmployeeDesignation() + "'" +
            ", employeeDepartment='" + getEmployeeDepartment() + "'" +
            ", employeeSalary='" + getEmployeeSalary() + "'" +
            "}";
    }
    
    
}
