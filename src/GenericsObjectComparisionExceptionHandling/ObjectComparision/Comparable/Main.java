package GenericsObjectComparisionExceptionHandling.ObjectComparision.Comparable;

public class Main
{
    public static void main(String[] args) {
        Student sohail=new Student(11,88);
        Student arun = new Student(8,99);

        if(sohail.compareTo(arun)<0)
        {
            System.out.println(sohail.compareTo(arun));
            System.out.println("Arun has secured more marks than Sohail");
        }
    }
}
