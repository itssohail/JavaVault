package Part3OopsEncapsulation;

public class BankAccount
{
    private  String accountNumber;
    private String accoundHolderName;
    private double balance;

    public String getAccoundHolderName() {
        return accoundHolderName;
    }

    public void setAccoundHolderName(String accoundHolderName) {
        this.accoundHolderName = accoundHolderName;
    }

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
      this.accountNumber="SBIN123";
      this.accoundHolderName=accountHolderName;
      this.balance=balance;
    }
}
