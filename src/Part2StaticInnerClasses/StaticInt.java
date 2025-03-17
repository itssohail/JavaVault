package Part2StaticInnerClasses;

public class StaticInt
{
    static int a=10;
    static int b;
    static {
        System.out.println("I am inside the static block");
        b=a*5;
    }

    public static void main(String[] args)
    {
        StaticInt obj = new StaticInt();
        System.out.println(a+" "+b);
        StaticInt.b=b+3;
        System.out.println(a+" "+b);
        StaticInt obj2 = new StaticInt();
        System.out.println(a+" "+b);

    }

}
