package Part3Polymorphism;

public class ToStringExample
{
    int num;
    ToStringExample(int num)
    {
        this.num=num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        ToStringExample obj  = new ToStringExample(54);
        System.out.println(obj);
    }
}
