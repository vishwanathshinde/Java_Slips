import java.util.*;
import java.io.*;

public class Q1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many integers you want to enter: ");
        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("enter the number: ");
            array[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Elements of array: "+array[i]+" ");
        }

        int max = array[0];
        for(int i=0; i<array.length; i++)
        {
            if(array[i]> max)
            {
                max = array[i];
            }
        }
        System.out.println("Largest number: "+max);
    }
}