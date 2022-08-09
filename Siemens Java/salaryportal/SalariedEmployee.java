package salaryportal;

abstract public class SalariedEmployee {

    private String salariedEmployeeId;
    private String salariedEmployeeName;
    private String salariedEmployeeDesignation;
    private SalaryComponent salaryAmount;
    private EmployeeAddress salariedEmployeeAddress;


    public SalariedEmployee(String salariedEmployeeId, String salariedEmployeeName, String salariedEmployeeDesignation, SalaryComponent salaryAmount, EmployeeAddress salariedEmployeeAddress) {
        this.salariedEmployeeId = salariedEmployeeId;
        this.salariedEmployeeName = salariedEmployeeName;
        this.salariedEmployeeDesignation = salariedEmployeeDesignation;
        this.salaryAmount = salaryAmount;
        this.salariedEmployeeAddress = salariedEmployeeAddress;
    }


    public String getSalariedEmployeeId() {
        return this.salariedEmployeeId;
    }

    public void setSalariedEmployeeId(String salariedEmployeeId) {
        this.salariedEmployeeId = salariedEmployeeId;
    }

    public String getSalariedEmployeeName() {
        return this.salariedEmployeeName;
    }

    public void setSalariedEmployeeName(String salariedEmployeeName) {
        this.salariedEmployeeName = salariedEmployeeName;
    }

    public String getSalariedEmployeeDesignation() {
        return this.salariedEmployeeDesignation;
    }

    public void setSalariedEmployeeDesignation(String salariedEmployeeDesignation) {
        this.salariedEmployeeDesignation = salariedEmployeeDesignation;
    }

    public SalaryComponent getSalaryAmount() {
        return this.salaryAmount;
    }

    public void setSalaryAmount(SalaryComponent salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public EmployeeAddress getSalariedEmployeeAddress() {
        return this.salariedEmployeeAddress;
    }

    public void setSalariedEmployeeAddress(EmployeeAddress salariedEmployeeAddress) {
        this.salariedEmployeeAddress = salariedEmployeeAddress;
    }


    @Override
    public String toString() {
        return "{" +
            " salariedEmployeeId='" + getSalariedEmployeeId() + "'" +
            ", salariedEmployeeName='" + getSalariedEmployeeName() + "'" +
            ", salariedEmployeeDesignation='" + getSalariedEmployeeDesignation() + "'" +
            ", salaryAmount='" + getSalaryAmount() + "'" +
            ", salariedEmployeeAddress='" + getSalariedEmployeeAddress() + "'" +
            "}";
    }

    abstract void calculateTax();


}
