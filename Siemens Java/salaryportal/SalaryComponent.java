package salaryportal;

public class SalaryComponent {
    private float SalaryBasic;
    private float salaryProfessionalTax;
    private float salaryTdsAmount;

    //Scenario where no tds deduction takes place
    public SalaryComponent(float SalaryBasic, float salaryProfessionalTax) {
        this.SalaryBasic = SalaryBasic;
        this.salaryProfessionalTax = salaryProfessionalTax;
    }

    //Scenario where TDS deduction is taking place 
    public SalaryComponent(float SalaryBasic, float salaryProfessionalTax, float salaryTdsAmount) {
        this(SalaryBasic, salaryProfessionalTax);
        this.salaryTdsAmount = salaryTdsAmount;
    }


    public float getSalaryBasic() {
        return this.SalaryBasic;
    }

    public void setSalaryBasic(float SalaryBasic) {
        this.SalaryBasic = SalaryBasic;
    }

    public float getSalaryProfessionalTax() {
        return this.salaryProfessionalTax;
    }

    public void setSalaryProfessionalTax(float salaryProfessionalTax) {
        this.salaryProfessionalTax = salaryProfessionalTax;
    }

    public float getSalaryTdsAmount() {
        return this.salaryTdsAmount;
    }

    public void setSalaryTdsAmount(float salaryTdsAmount) {
        this.salaryTdsAmount = salaryTdsAmount;
    }


    @Override
    public String toString() {
        return "{" +
            " SalaryBasic='" + getSalaryBasic() + "'" +
            ", salaryProfessionalTax='" + getSalaryProfessionalTax() + "'" +
            ", salaryTdsAmount='" + getSalaryTdsAmount() + "'" +
            "}";
    }
    

}    