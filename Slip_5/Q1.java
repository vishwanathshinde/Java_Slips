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
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    factorial() 
    {
        try
        {
            System.out.println("Enter any number to check factorial: ");
            a = Integer.parseInt(br.readLine());
            if(a == 0)
                throw new NumberException();
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

    void factorialnumber()
    {
        int fact = 0;
        for(int i=1; i<=a; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial is: "+fact);
    }
}

public class Q1
{
    public static void main(String[] args) 
    {
        factorial f = new factorial();
        f.factorialnumber();
    }
}