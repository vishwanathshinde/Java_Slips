import java.util.*;
import java.io.*;

public class Q1
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int a = Integer.parseInt(br.readLine());

        int count=0;

        for(int i=2; i<a; i++)
        {
            if(a%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
            System.out.println(a+" is a prime number!");
        else
            System.out.println(a+" is NOT a prime number!");
    }
}