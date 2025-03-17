package Part3Oops.Inheritance.Super;

public class ParentClass
{
    int length;
    int breadth;
    int height;
    ParentClass()
    {
        System.out.println("Im in parent class Constructor");
    }

    public ParentClass(int length, int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
        this.length = length;
    }
}
