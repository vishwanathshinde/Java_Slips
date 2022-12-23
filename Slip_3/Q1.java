import java.util.*;
import java.io.*;

public class Q1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter how many numbers you want to enter: ");
        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the number: ");
            array[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0; i<array.length; i++)
        {
            System.out.println("Elements of array are: "+ array[i]+ " ");
        }

        int sum=0;
        for(int i=0; i<array.length; i++)
        {
            sum = sum + array[i];
        }
        System.out.println("Sum of array is: "+ sum);
    }
}