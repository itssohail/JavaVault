    package ExceptionHandling.ExceptionTasks;

    import java.util.Scanner;

    public class NullPointerExceptionTask
    {
        static Scanner sc=new Scanner(System.in);
        public static void main(String[] args) {
            String name=null;
            try {
                nullMethod(name);
            }
            catch (NullPointerException e)
            {
                System.out.println("Exception caught "+e.getMessage());
            }
        }
        static void nullMethod(String name) throws NullPointerException
        {
            if(name==null)
            {
                System.out.println("Hey sohail");
                throw new NullPointerException("Bro why are you comparing null values.");
            }
        }
    }
