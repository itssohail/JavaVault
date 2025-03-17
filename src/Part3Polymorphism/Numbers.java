package Part3Polymorphism;

public class Numbers
{
    double sum(double a, int b)
    {
        return a+b;
    }
    double sum(int a, int b)
    {
        return a+b;
    }

    int sum(int a, int b, int c)
    {
        return a+b+c;
    }
    void sum(String a,int b)
    {

    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2,4);//uses the int a, int b because of the priority if none then double a, double b
        obj.sum(2,4,5);
    }
}
