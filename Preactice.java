import java.io.*;

class NumberException extends Exception
{
    public String toString()
    {
        return ("number is 0 !");
    }
}

class factorial
{
    factorial() 
    {
        int a;
        int i=1, fact=1;
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter nuber to check factorial: ");
            a = Integer.parseInt(br.readLine());

            if(a==0)
                throw new NumberException();
            else
                while(i<=a)
                {
                    fact = fact * i;
                    i++;
                }
                System.out.println("Factorial: " + fact);

        }
        catch(NumberException e)
        {
            System.out.println(e);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}

public class Preactice
{
    public static void main(String[] args)
    {
        factorial f = new factorial();
    }
}