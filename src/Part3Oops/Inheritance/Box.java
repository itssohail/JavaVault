package Part3Oops.Inheritance;

public class Box
{
     double length;
    double height;
    double width;

   Box()
   {
       //super(); Object class.
       System.out.println("Parent class constructor has been called..");
       this.height=-1;
       this.length=-1;
       this.width=-1;
   }
   //Cube
    Box(double side)
    {
        System.out.println("Cube function is running");
        this.width=side;
        this.length=side;
        this.height=side;
    }
    //rectanble
    Box(double length,double width)
    {
        System.out.println("Rectangle function is working here");
        this.length=length;
        this.width=width;
        System.out.println(this.length*this.width);


    }
    Box(double length,double width,double height)
    {
        System.out.println("Three param Constructor ");
        this.length=length;
        this.width=width;
        this.height=height;
        System.out.println(this.length*this.width);

    }
    Box(Box old)
    {
        System.out.println("Constructor taking type of Box");
        this.length=old.length;
        this.height=old.height;
        this.width=old.width;

        System.out.println(
                this.height);


    }
    public void Information()
    {
        System.out.println("Running the box...");

    }
}
