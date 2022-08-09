package constructorchaining;

public class Employee {


    private String employeeID;
    private String employeeName;
    private String employeeProject;
    private String employeeDesignation;


    public Employee(String employeeID) {
        this.employeeID = employeeID;
    }

    public Employee(String employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public Employee(String employeeID, String employeeName, String employeeDesignation) {
        this(employeeID, employeeName);
        this.employeeDesignation = employeeDesignation;
    }

    public Employee(String employeeID, String employeeName, String employeeProject, String employeeDesignation) {
        this(employeeID, employeeName, employeeDesignation);
        this.employeeProject = employeeProject;
    }
    
}
