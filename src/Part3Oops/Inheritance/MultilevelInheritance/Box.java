package Part3Oops.Inheritance.MultilevelInheritance;

public class Box
{
    int length;
    int width;
    int height;
    Box()
    {
        System.out.println("Contructor of Box(grandparent) is called");
    }
    Box(int length,int width,int height)
    {
        System.out.println("Parameterized constructor of Box is being called");
        this.length=length;
        this.width=width;
        this.height=height;
        System.out.println(length);
        System.out.println(width);
        System.out.println(height);

    }
}
