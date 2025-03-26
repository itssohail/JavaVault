package Part2StaticInnerClasses.Singleton.singleton2;

import Part2StaticInnerClasses.Singleton.Singleton;

public class SingletonAgain
{
    private int num=10;
    //1.If you only want to create only one object, You should not allow to call the constructor.
    private SingletonAgain()
    {
        System.out.println("Made the constructor private so that it cannot be instantiated");
    }
    private static SingletonAgain instance;
    //lets create a method that gives us an instance
    public static SingletonAgain getInstance()
    {
        if (instance==null)
        {
            instance=new SingletonAgain();
        }
        return instance;
    }


}
