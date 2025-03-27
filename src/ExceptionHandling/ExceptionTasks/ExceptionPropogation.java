package ExceptionHandling.ExceptionTasks;

public class ExceptionPropogation
{
    public static void main(String[] args) {
        try{
            methA();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
    static int methA()
    {
        return methB();
    }
    static int methB()
    {
        return methC();
    }
    static int methC()
    {
        int a=10,b=0;
        if(b==0) throw new ArithmeticException("CANNOT DIVIDE BY ZERO");
        return a/b;
    }
}
