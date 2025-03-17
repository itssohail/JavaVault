package Part4.accesscontrol;

public class ClassA
{
    int num;
    String name;
    int[] arr;

    public ClassA( int num,String name) {
        this.num = num;
        this.name = name;
        this.arr=new int[num];
    }
}
