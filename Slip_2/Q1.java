import java.util.*;
import java.io.*;

public class Q1
{
    public static void main(String[] args) throws IOException
    {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList al = new ArrayList();
        System.out.println("Enter how many integers you want to enter: ");
        n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter a number: ");
            int x = Integer.parseInt(br.readLine());
            al.add(x);
        }
        
        ListIterator itr = al.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}