package Part1IntroductionOopsClassesConstructors;

public class Student
{
    public static void main(String[] args) {
       StudentDetails sohail = new StudentDetails();
       sohail.rno=7;
       sohail.name="Ameer";
       sohail.marks=98;
        System.out.println(sohail.rno);
        System.out.println(sohail.name);
        System.out.println(sohail.marks);
    }

}
class StudentDetails
{
    int rno;
    String name;
    float marks;
}
