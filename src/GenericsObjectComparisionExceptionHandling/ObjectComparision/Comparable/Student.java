package GenericsObjectComparisionExceptionHandling.ObjectComparision.Comparable;

public class Student implements Comparable<Student> {

    int roll;
    int marks;
    public Student(int roll, int marks)
    {
        this.roll=roll;
        this.marks=marks;
    }
    public int compareTo(Student o)
    {
        int diff=this.marks-o.marks;
        return diff;
    }


}
