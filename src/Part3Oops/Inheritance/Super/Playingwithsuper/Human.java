package Part3Oops.Inheritance.Super.Playingwithsuper;

public class Human extends Species
{
    int bio;
    String name;
    Human(int bio,String name,String class1)
    {
        //you cant assign values but can access it.
        System.out.println(this.name=name);
        System.out.println(super.name);
        System.out.println("Child class constructor has been called..");
    }
}
