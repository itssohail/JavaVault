package Part3Oops.Inheritance;

public class BoxChild extends Box
{
    double weight;
    BoxChild()
    {
        System.out.println("Child class constructor has been called");;
        this.weight=-1;

    }
    BoxChild(double length,double height,double width,double weight)
    {
      super(length,width,height);//what is this?? Its saying, call the parents class constructor.
        //used to initialize values present in parent class.
        this.weight=weight;
    }

}
