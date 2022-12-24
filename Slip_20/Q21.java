import java.util.*;
import java.io.*;

class Employee
{
    int id, salary;
    String name, deptname;
    static int count;

    Employee()
    {
        id=0;
        name=null;
        deptname=null;
        salary=0;
    }

    Employee(int id, String name, String deptname, int salary)
    {
        this.id=id;
        this.name=name;
        this.deptname=deptname;
        this.salary=salary;
        count++;
    }

    public static void count()
    {
        System.out.println("object "+count+" created");
    }

    public void display()
    {
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("deptname: "+deptname);
        System.out.println("salary: "+salary);
        System.out.println("--------------------------");
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(1,"aaa","sci",500);
        Employee.count();
        Employee e2 = new Employee(2,"bbb","comm",600);
        Employee.count();
        Employee e3 = new Employee(3,"ccc","arts",400);
        Employee.count();

        e1.display();
        e2.display();
        e3.display();
    }
}