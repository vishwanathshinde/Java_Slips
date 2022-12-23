import java.util.*;
import java.io.*;

public class Q1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet ts = new TreeSet();
        System.out.print("Enter how many integers you want to enter: ");
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the number: ");
            int a = Integer.parseInt(br.readLine());
            ts.add(a);
        }

        Iterator itr = ts.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.print("Enter no to search: ");
        int no = Integer.parseInt(br.readLine());

        if(ts.contains(no))
            System.out.println("Number Found!");
        else
            System.out.println("Number NOT Found!");

    }
}