package ExceptionHandling.CustomExceptions;

public class MyException extends Exception
{
    //1.create a constructor
    public MyException(String message)
    {
        super(message);
    }
}
