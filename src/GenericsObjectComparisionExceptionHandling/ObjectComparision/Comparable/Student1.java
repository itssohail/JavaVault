package GenericsObjectComparisionExceptionHandling.ObjectComparision.Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student1 implements Comparable<Student1>
{
    int age;
   String name;

    @Override
    public String toString() {
        return "Student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student1(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    public int compareTo(Student1 s1)
    {
        if(this.age>s1.age)
            return 1;
        if(this.age<s1.age)
            return -1;
        else return 0;
    }

}
class Check
{
    public static void main(String[] args) {
        ArrayList<Student1> studs = new ArrayList<>();
        studs.add(new Student1(92,"pratheeka"));
        studs.add(new Student1(21,"sohail"));
        studs.add(new Student1(83,"kiran"));
        studs.add(new Student1(94,"divya"));
        studs.add(new Student1(43,"arun"));



        Collections.sort(studs);
        for(Student1 s:studs)
        {
            System.out.println(s);
        }
    }
}


