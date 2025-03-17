package Part2StaticInnerClasses;



 public class InnerClasses
{
    static class Test{
         String name;
         Test(String name)
        {
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a= new Test("sohail");
            Test b=new  Test("Arun");

        System.out.println(a.name);
        System.out.println(b.name);
    }

}
