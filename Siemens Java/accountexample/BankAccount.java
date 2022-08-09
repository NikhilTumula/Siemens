package accountexample;

public class BankAccount {

    private String bankAccountHolderName;
    private String bankAccountCustomerID;
    private long bankAccountNumber;
    private String bankAccountIfscCode;

    private DebitCard bankAccountDebitCard; //composition

    public String getBankAccountHolderName() {
        return this.bankAccountHolderName;
    }

    public void setBankAccountHolderName(String bankAccountHolderName) {
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public String getBankAccountCustomerID() {
        return this.bankAccountCustomerID;
    }

    public void setBankAccountCustomerID(String bankAccountCustomerID) {
        this.bankAccountCustomerID = bankAccountCustomerID;
    }

    public long getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountIfscCode() {
        return this.bankAccountIfscCode;
    }

    public void setBankAccountIfscCode(String bankAccountIfscCode) {
        this.bankAccountIfscCode = bankAccountIfscCode;
    }

    @Override
    public String toString() {
        return "{" +
            " bankAccountHolderName='" + getBankAccountHolderName() + "'" +
            ", bankAccountCustomerID='" + getBankAccountCustomerID() + "'" +
            ", bankAccountNumber='" + getBankAccountNumber() + "'" +
            ", bankAccountIfscCode='" + getBankAccountIfscCode() + "'" +
            "}";
    }

    public BankAccount(String bankAccountHolderName, String bankAccountCustomerID, long bankAccountNumber, String bankAccountIfscCode) {
        this.bankAccountHolderName = bankAccountHolderName;
        this.bankAccountCustomerID = bankAccountCustomerID;
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountIfscCode = bankAccountIfscCode;
    }

    
}
