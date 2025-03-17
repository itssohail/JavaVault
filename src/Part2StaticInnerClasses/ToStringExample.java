package Part2StaticInnerClasses;

public class ToStringExample
{
    static class Test
    {
        String name;
        Test(String name)
        {
            this.name=name;
        }

        @Override
        public String toString() {
            return "Hi Sohail";
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Sohail");
//        System.out.println("Before to string: "+a);
        System.out.println("After to string:"+a);
    }
}
