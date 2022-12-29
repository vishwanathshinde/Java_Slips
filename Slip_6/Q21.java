import java.util.*;
import java.io.*;

class Employee
{
    public int id, salary;
    public String name;
    Scanner sc = new Scanner(System.in);

    public void accept()
    {
            System.out.println("Enter id: ");
            id = sc.nextInt();
            System.out.println("Enter name: ");
            name = sc.next();
            System.out.println("Enter salary: ");
            salary = sc.nextInt();
            System.out.println("-----------------");
    }

    public void display()
    {
        System.out.println("The name of employee whom have maximum salary is: " + name);
    }

    public void maxsalary(Employee E[], int n)
    {
        int max, pos = 0;
        max = E[0].salary;

        for(int i=0; i<n; i++)
        {
            if(max < E[i].salary)
            {
                max = E[i].salary;
                pos = i;
            }
        }
        //System.out.println("The name of employee whom have maximum salary is: ");
        E[pos].display();
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many employees information you want to enter: ");
        int n = sc.nextInt();

        Employee E[] = new Employee[n];

        for(i=0; i<n; i++)
        {
            E[i] = new Employee();
            E[i].accept();
        }
        for(i=0; i<1; i++)
        {
            E[i].maxsalary(E,n);
        }
    }
}