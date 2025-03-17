package Part3Oops.Inheritance.Super;

public class ChildClass extends ParentClass
{
    int weight;
    ChildClass()
    {
       super();
        System.out.println("Child Class Constructor is called");
//       super();//Call to 'super()' must be first statement in constructor body.
    }
    ChildClass(int length,int breadth,int width,int height)
    {
        super(length,breadth,width);
        this.height=height;
        System.out.println("Parent class constructor has been called.");


    }

}
