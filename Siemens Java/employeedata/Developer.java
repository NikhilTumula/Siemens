package employeedata;

public class Developer extends Employee {

    private int developerId;
    
    public Developer(int employeeAge, String employeeName, String employeeDesignation, String employeeDepartment, float employeeSalary,int developerId){
        super(employeeAge, employeeName, employeeDesignation, employeeDepartment, employeeSalary);
        this.developerId = developerId;
    }


    public int getDeveloperId() {
        return this.developerId;
    }

    public void setDeveloperId(int developerId) {
        this.developerId = developerId;
    }
    
    
}
