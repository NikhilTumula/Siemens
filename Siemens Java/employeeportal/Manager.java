package employeeportal;

public class Manager extends Employee{

    private String managerLocation;
    private int managerTeamSize;

    public Manager(String employeeName, int employeeAge,Gender employeeGender, 
    String employeeDesignation,float employeeSalary, 
    String managerLocation,int managerTeamSize) 
    
    
    {
        super(employeeName, employeeAge, employeeGender, employeeDesignation, employeeSalary);

        this.managerLocation=managerLocation;
        this.managerTeamSize=managerTeamSize;

    }    
}
