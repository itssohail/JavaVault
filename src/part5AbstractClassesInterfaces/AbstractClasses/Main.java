package part5AbstractClassesInterfaces.AbstractClasses;

public class Main
{
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

            Daughther daughther = new Daughther(40);
            daughther.career();

            //can you call an abstract class constructor?
        //you cannot objects of an abstract class.
//        Parent parent = new Parent() {
//        }
//calling static method present in parent
        Parent.hello();

        son.normal();

    }
}

