package Part4.objectClass;

public class ObjectClass
{

    int number;
    float gpa;
    public ObjectClass(int number,float gpa)
    {
        this.number=number;
        this.gpa=gpa;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.number==((ObjectClass)obj).number;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(7,43434.4f);
        ObjectClass obj1 = new ObjectClass(7,643.4f);
        if(obj.equals(obj1))
        {
            System.out.println("Obj is equal to obj2..");
        }
        if(obj==obj1)
        {
            System.out.println("Obj is equal to obj2..");
        }

        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
    }
}
