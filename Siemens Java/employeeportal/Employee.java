package employeeportal;

public class Employee {
    private int employeeAge;
    private String employeeName;
    private String employeeDesignation;
    private Gender employeeGender;
    private float employeeSalary;


    public Employee(String employeeName, int employeeAge, Gender employeeGender, String employeeDesignation, float employeeSalary) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeGender = employeeGender;
        this.employeeDesignation = employeeDesignation;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return this.employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Gender getEmployeeGender() {
        return this.employeeGender;
    }

    public void setEmployeeGender(Gender employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeDesignation() {
        return this.employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
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
            " employeeName='" + getEmployeeName() + "'" +
            ", employeeAge='" + getEmployeeAge() + "'" +
            ", employeeGender='" + getEmployeeGender() + "'" +
            ", employeeDesignation='" + getEmployeeDesignation() + "'" +
            ", employeeSalary='" + getEmployeeSalary() + "'" +
            "}";
    }

}
