import java.util.*;
import java.io.*;

public class Q1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int a = Integer.parseInt(br.readLine());
        
        int sum = 0;
        int i = 1;

        while(i <= a/2)
        {
            if(a % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum == a)
        {
            System.out.println(a + " is a perfect number!");
        }
        else
        {
            System.out.println(a + " is NOT perfect number!");
        }
    }
}