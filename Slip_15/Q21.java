import java.util.*;
import java.io.*;

class Employee
{
    String name;
    int salary;

    Employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }
}

class Developer extends Employee
{
    String projectname;

    Developer(String name, int salary, String projectname)
    {
        super(name,salary);
        this.projectname=projectname;
    }

    void display()
    {
        System.out.println("Employee Deatails Are: ");
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);
        System.out.println("project name: "+projectname);
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        Developer dv = new Developer("Raja",50000,"MyApplication");
        dv.display();
    }
}