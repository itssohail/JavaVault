package ExceptionHandling.ExceptionTasks;

import java.util.Scanner;

public class UserDefinedException
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Vote eligibility check");
        try {
            System.out.println("ENTER YOUR AGE:");
            int age= sc.nextInt();
            if(age<18)
            {
                throw new UserDefinedHandling("You are not allowed to vote. Please Go home");
            }
        }
        catch (UserDefinedHandling e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Okay who's next in the line...");
    }
}
class UserDefinedHandling extends Exception
{
    public UserDefinedHandling(String message)
    {
        super(message);
    }
}