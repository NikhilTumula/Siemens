package salaryportal;

public class ManagerEmployee extends SalariedEmployee{
    private int managerEmployeeTeamSize;

    public ManagerEmployee(String salariedEmployeeId, String salariedEmployeeName, String salariedEmployeeDesignation, 
    SalaryComponent salaryAmount, EmployeeAddress salariedEmployeeAddress,int managerEmployeeTeamSize){

        super(salariedEmployeeId,salariedEmployeeName, salariedEmployeeDesignation, salaryAmount, salariedEmployeeAddress);

        this.managerEmployeeTeamSize = managerEmployeeTeamSize;
    }

    @Override
    public void calculateTax() {

        System.out.println("Tax for Manager: 23000");
    }

    
}
