package Part2StaticInnerClasses;

public class Main
{
    public static void main(String[] args) {
        Human sohail = new Human(22,"sohail Ameer",75000,false);
        Human arun = new Human(23,"arun Kumar",85000,true);
        System.out.println(sohail.name);
        System.out.println(arun.name);
        //when trying to call a non static method it throws an error
        new Main().show();
    }
  static void greet()
    {
       int x=1;
       x++;
        System.out.println(x++);
        System.out.println(x);

    }
    void helloWorld()
    {
        show();
    }
    void show()
    {
        System.out.println("Hello world");
       greet();
    }




}
