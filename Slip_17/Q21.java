import java.util.*;
import java.io.*;

class Student
{
    int rollno;
    String name;
    static int count = 0;

    public Student()
    {
        rollno=0;
        name=null;
    }

    public Student(int rollno, String name)
    {
        this.rollno=rollno;
        this.name=name;
        count++;
    }

    public static void count()
    {
        System.out.println("Object "+count+" Created");
    }

    public void display()
    {
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: "+name);
        System.out.println("------------------------------");
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        Student s1 = new Student(7,"Raja");
        Student.count();
        Student s2 = new Student(9,"Ram");
        Student.count();
        Student s3 = new Student(11,"Sham");
        Student.count();

        s1.display();
        s2.display();
        s3.display();
    }
}