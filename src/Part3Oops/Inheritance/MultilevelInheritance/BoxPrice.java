package Part3Oops.Inheritance.MultilevelInheritance;

public class BoxPrice extends BoxWeight
{
    int price;
    BoxPrice()
    {
        System.out.println("Contructor of BoxPrice is being called");
        this.price=-1;
    }
    BoxPrice(BoxPrice other) {
    super(other);
    this.price=other.price;
    }

    public BoxPrice(int length,int width,int height,int weight,int price) {
       super(length,width,height,weight);
        this.price = price;
        System.out.println("Price:"+price);
    }

    public static void main(String[] args) {
        BoxPrice obj = new BoxPrice();
        System.out.println(obj.length);
        System.out.println(obj.width);
        System.out.println(obj.height);
        //in above im able to access parent(grandparent) properties
        System.out.println(obj.price);
        System.out.println(obj.weight);


    }
}
