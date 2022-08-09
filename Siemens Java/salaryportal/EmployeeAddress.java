package salaryportal;

public class EmployeeAddress {
    private String employeeAddressLocation;
    private int employeeAddressPinCode;
    private String employeeAddressState;


    public EmployeeAddress(String employeeAddressLocation, int employeeAddressPinCode, String employeeAddressState) {
        this.employeeAddressLocation = employeeAddressLocation;
        this.employeeAddressPinCode = employeeAddressPinCode;
        this.employeeAddressState = employeeAddressState;
    }


    public String getEmployeeAddressLocation() {
        return this.employeeAddressLocation;
    }

    public void setEmployeeAddressLocation(String employeeAddressLocation) {
        this.employeeAddressLocation = employeeAddressLocation;
    }

    public int getEmployeeAddressPinCode() {
        return this.employeeAddressPinCode;
    }

    public void setEmployeeAddressPinCode(int employeeAddressPinCode) {
        this.employeeAddressPinCode = employeeAddressPinCode;
    }

    public String getEmployeeAddressState() {
        return this.employeeAddressState;
    }

    public void setEmployeeAddressState(String employeeAddressState) {
        this.employeeAddressState = employeeAddressState;
    }


    @Override
    public String toString() {
        return "{" +
            " employeeAddressLocation='" + getEmployeeAddressLocation() + "'" +
            ", employeeAddressPinCode='" + getEmployeeAddressPinCode() + "'" +
            ", employeeAddressState='" + getEmployeeAddressState() + "'" +
            "}";
    }


    
}
