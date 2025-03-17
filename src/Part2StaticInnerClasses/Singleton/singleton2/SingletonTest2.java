package Part2StaticInnerClasses.Singleton.singleton2;

public class SingletonTest2
{
    public static void main(String[] args) {
        System.out.println("Accessing the singleton object from singletonDay2 class");
        SingletonDay2 obj = SingletonDay2.getInstance2();
        SingletonDay2 obj1 = SingletonDay2.getInstance2();
        System.out.println(obj1);
        System.out.println(obj);
        if(obj1==obj)
        {
            System.out.println(true);
        }
    }
}
