import java.util.*;
import java.io.*;

class NumberException extends Exception
{
    public String toString()
    {
        return("Number is 0");
    }
}

class factorial 
{
    int a;
    int i=1, fact = 1;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    factorial() 
    {
        try
        {
            System.out.println("Enter any number to check factorial: ");
            a = Integer.parseInt(br.readLine());
            if(a == 0)
                throw new NumberException();
            else
                while(i<=a)
                {
                    fact = fact * i;
                    i++;
                }
                System.out.println("Factorial is: "+fact);
        }
        catch(NumberException e)
        {
            System.out.println(e);
        }
        catch(IOException ex)
        {
            System.out.println("Enter no other than 0!");
        }   

    }
}

public class Q1
{
    public static void main(String[] args) 
    {
        factorial f = new factorial();
    }
}