package Part2StaticInnerClasses.Singleton.SingletonProject;

public class Logger
{
   //1. make the constructor private
    private Logger()
    {
        System.out.println("Made the Constructor private. So that i cannot be accessed. Restrict" +
                "object creation");
    }
    public static Logger instance;
    public static Logger getInstance()
    {
        if(instance==null)
        {
            instance=new Logger();
        }
        return instance;
    }
    public void log (String message)
    {
        System.out.println("LOG: " + message);
    }

}
class SingletonDemo {
    public static void main(String[] args) {
        Logger log1=Logger.getInstance();
        Logger log2=Logger.getInstance();

        log1.log("This is the first message");
        log2.log("This is the Second message");

        System.out.println("Are logger1 and logger2 the same instance? " + (log1 == log2));

    }
}
