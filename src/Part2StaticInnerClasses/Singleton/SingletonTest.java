package Part2StaticInnerClasses.Singleton;

public class SingletonTest
{
    public static void main(String[] args) {
//        Singleton obj = new Singleton();
        //Gives you error because i made the constructor private.

        Singleton obj =Singleton.getInstance();
        Singleton obj1= Singleton.getInstance();
        System.out.println("Checking the address: "+obj);
        System.out.println("Checking the address: "+obj1);
        //ALL THREE ARE POINTING ARE POINTING TO JUST ONE OBJECT....

    }
}
