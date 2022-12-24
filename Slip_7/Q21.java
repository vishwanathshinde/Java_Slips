import java.util.*;
import java.io.*;

class Student
{
    int rollno, percentage;
    String name;
    Scanner sc = new Scanner(System.in);

    Student()
    {
        rollno = 0;
        percentage = 0;
        name = null;
    }

    Student(int rollno, String name, int percentage)
    {
        this.rollno=rollno;
        this.name=name;
        this.percentage=percentage;
    }

    public void accept()
    {
        System.out.println("Enter student roll no: ");
        rollno = sc.nextInt();
        System.out.println("Enter Student Name: ");
        name = sc.next();
        System.out.println("Enter student percentage: ");
        percentage = sc.nextInt();
        System.out.println("----------------------------");
    }

    public void display()
    {
        System.out.println("Student roll no is: "+rollno);
        System.out.println("Student name is: "+name);
        System.out.println("Student percentage is: "+percentage);
        System.out.println("----------------------------");
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many students information you want to enter: ");
        int n = sc.nextInt();

        Student stud = new Student();

        for(int i=0; i<n; i++)
        {
            stud.accept();
        }
        for(int i=0; i<n; i++)
        {
            stud.display();
        }


    }
}