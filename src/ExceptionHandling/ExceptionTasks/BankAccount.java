package ExceptionHandling.ExceptionTasks;

import java.util.Scanner;

class Banking extends Exception
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        BankAccount bankacc = new BankAccount(5000);
        System.out.println("Enter the amount to withdraw");
        try{
            bankacc.withdraw(sc.nextInt());
        }
        catch (InsufficientFundsException e)
        {
            System.out.println("Transaction failed "+e.getMessage());
        }
        finally {
            System.out.println("Do you want to go back to menu? ");
        }
    }
}
public class BankAccount
{
    private double balance;
    public BankAccount(double balance)
    {
        this.balance=balance;
    }
    public void withdraw(double amount) throws InsufficientFundsException
    {
        if(amount>balance)
        {
            throw new InsufficientFundsException("Insufficient balance. Available balance is "+balance);
        }
        balance=balance-amount;
        System.out.println("Withdraw successfull. Remaining balance is: "+balance);
    }
}
class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String message)
    {
        super(message);
    }
}

