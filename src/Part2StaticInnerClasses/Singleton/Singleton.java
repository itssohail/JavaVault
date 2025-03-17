package Part2StaticInnerClasses.Singleton;

public class Singleton
{
    private Singleton()
    {
        System.out.println("Private the constructor so that it cannot be instantiated");
    }
    private static Singleton instance;
    public static Singleton getInstance()
    {
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    }
}
