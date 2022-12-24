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

class Programmer extends Employee
{
    String proglanguage;

    Programmer(String name, int salary, String proglanguage)
    {
        super(name,salary);
        this.proglanguage=proglanguage;
    }

    void display()
    {
        System.out.println("Employee Deatails Are: ");
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);
        System.out.println("programmin language: "+proglanguage);
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        Programmer dv = new Programmer("Raja",50000,"MyApplication");
        dv.display();
    }
}