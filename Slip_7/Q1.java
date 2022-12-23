import java.util.*;
import java.io.*;

public class Q1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of employee details you want to enter: ");
        int n = Integer.parseInt(br.readLine());

        Hashtable ht = new Hashtable();

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter employee name: ");
            String name = br.readLine();
            System.out.println("Enter employee salary: ");
            int salary = Integer.parseInt(br.readLine());

            ht.put(name,salary);
        }
        System.out.println(ht);

        Enumeration k = ht.keys();
        Enumeration e = ht.elements();
        System.out.println("Name\tSalary");

        while(k.hasMoreElements())
        {
            System.out.println(k.nextElement()+"\t"+e.nextElement());
        }
    }
}