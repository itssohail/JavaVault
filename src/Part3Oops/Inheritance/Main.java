package Part3Oops.Inheritance;

public class Main
{
    public static void main(String[] args) {
//        Box obj = new Box(2,4,5);
//        Box obj1=new Box(obj);
//        System.out.println(obj1.length+" "+obj1.width+" "+obj1.height);
//        BoxChild bc = new BoxChild();
//        BoxChild bc1= new BoxChild(1,2,3,4);
//        System.out.println(bc.height+" "+bc.weight);
//
//        Box obj = new BoxChild(2,3,4,5);
//        System.out.println(obj.weight); gives you error.. cant access child class properties
        //with parent class reference

        //there are many variables present in both parent and child  classes
        //you are given access to variables that are in the type ref ie BoxChild
        //hence you should have access to tho weight vairable
        //but inorder to access them you must initialise it right?? But you are not able to initialise
        //it if you are creating a parent class object with child class reference and trying to access child
        //class properties. Not accessing you cant even write that line without error.
//        BoxChild bxchild = new Box(); Error because, you are trying to reference a Child to a Parent
        //not possible.

        BoxChild bc = new BoxChild(2,3,4,5);

    }
}
