package part5AbstractClassesInterfaces.AbstractClasses;

public class Son extends Parent
{

    public Son(int age)
    {
        super(age);

    }
    @Override
    void career()
    {
        System.out.println("I am going to be doctor");
    }

    @Override
    void partner() {
        System.out.println("I love pepper pots");
    }

    @Override
    void normal() {
        super.normal();
    }
}
