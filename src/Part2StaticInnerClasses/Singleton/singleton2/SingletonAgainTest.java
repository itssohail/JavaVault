package Part2StaticInnerClasses.Singleton.singleton2;

public class SingletonAgainTest
{
    public static void main(String[] args) {
//        SingletonAgain obj = new SingletonAgain();
        //CANNOT . BECAUSE I MADE THE CONSTRUCTOR PRIVATE.
        SingletonAgain obj=SingletonAgain.getInstance();
    }
}
