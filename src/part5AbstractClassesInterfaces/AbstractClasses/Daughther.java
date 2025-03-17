package part5AbstractClassesInterfaces.AbstractClasses;

public class Daughther extends Parent
{
    public Daughther(int age)
    {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be coder");

    }

    @Override
    void partner() {

        System.out.println("I love iron man");

    }
}
