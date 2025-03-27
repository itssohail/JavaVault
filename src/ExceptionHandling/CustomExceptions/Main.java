package ExceptionHandling.CustomExceptions;

import java.util.Scanner;
import java.util.SortedMap;

public class Main
{
    public static void main(String[] args) {
        try
        {
            System.out.println("Enter the name");
            Scanner sc= new Scanner(System.in);
            String name = sc.next();
            if(name.equals("sohail"))
            {
                throw new MyException("Sohail is not allowed sorry");
            }
        }
        catch (MyException me)
        {
            System.out.println(me.getMessage());
        }
    }
}
