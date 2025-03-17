package part5AbstractClassesInterfaces.AbstractClasses;

 public abstract class Parent
{
    int age;
    abstract void career();
    abstract void partner();

    //can we create an constructor of an abstract class?
    public Parent(int age)
    {
        this.age=age;
    }
    //Can you create abstract constructors?
//    public abstract Parent();
    static void hello()
    {
        System.out.println("Hello im a static method present in Abstract parent class");
    }

    void normal()
    {
        System.out.println("This is a normal method");
    }


}
