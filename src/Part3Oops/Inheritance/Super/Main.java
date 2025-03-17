package Part3Oops.Inheritance.Super;

public class Main
{
    public static void main(String[] args) {
        ChildClass obj  = new ChildClass();
        System.out.println("Main method of main method is being called");
        ChildClass ob1= new ChildClass(3,4,5,6);
        //parents cant access child class properties
        ParentClass pc = new ParentClass();
//        System.out.println(pc.weight);

        //you can access parent class properties using child class object.
        ChildClass cc = new ChildClass();
        System.out.println(cc.length);
        System.out.println(cc.breadth);
        System.out.println(cc.weight);
        System.out.println(cc.height);
    }
}
