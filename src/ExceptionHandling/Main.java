package ExceptionHandling;

public class Main
{
    public static void main(String[] args) {
        int a=5,b=0;
        try
        {
            divide(a,b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This always get exectued");
        }
    }
    static int divide(int a, int b) throws ArithmeticException
    {
        if(b==0)
            throw new ArithmeticException("Please Do not divide by ZERO");

        return a/b;
    }

}
