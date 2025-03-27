package ExceptionHandling.ExceptionTasks;

public class FinallyBlock
{
    public static void main(String[] args) {
        try{
            String name=null;
            if(name.equals("sohail"))
            {
                System.out.println("I am inside TRY BLOCK");
            }
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I am inside finally ");
            System.out.println("I will still keep executing even if there's an Exception");
        }
    }
}
