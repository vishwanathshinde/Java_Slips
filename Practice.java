import java.util.*;

class Employee
{
    int id, salary;
    String name, deptname;

    static int count;

    Employee()
    {
        name = null;
        id = 0;
        salary = 0;
        deptname = null;
    }

    Employee(String name, int id, int salary, String deptname)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.deptname=deptname;

        count++;
    }

    public static void count()
    {
        System.out.println("Object " + count + " created");
    }

    void display()
    {
        System.out.println("Name of employee: " + name);
        System.out.println("Id of employee: " + id);
        System.out.println("Salary of employee: " + salary);
        System.out.println("Department name of employee: " + deptname);
        System.out.println("-----------------------------------");
    }
}

public class Practice
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Raj", 10, 50000, "Science");
        e1.count();
        e1.display();
    }
}