package Part3Oops.Inheritance.MultilevelInheritance;

public class BoxWeight extends Box
{
    int weight;
    BoxWeight()
    {
        System.out.println("Constructor of BoxWeight is being called");
    }
    BoxWeight(BoxWeight box)
    {

    }
    BoxWeight(int length,int width,int height,int weight)
    {
        super(length,width,height);
        this.weight=weight;
        System.out.println("Height :"+weight);
    }

}
