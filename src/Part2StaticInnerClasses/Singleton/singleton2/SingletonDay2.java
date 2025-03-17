package Part2StaticInnerClasses.Singleton.singleton2;

public class SingletonDay2
{
    private SingletonDay2()
    {
        System.out.println("Cannot be accessed outside this class");
    }
    private static SingletonDay2 instance;
    public static SingletonDay2 getInstance2()
    {
        if(instance==null)
        {
            instance=new SingletonDay2();
        }
        return instance;
    }
}
