import java.util.*;
import java.io.*;

class MyNumber
{
    private int x;

    public MyNumber()
    {
        x=0;
    }

    public MyNumber(int x)
    {
        this.x=x;
    }

    public boolean isNegative()
    {
        if(x<0)
            return true;
        else 
            return false;
    }

    public boolean isPositive()
    {
        if(x>=0)
            return true;
        else
            return false;
    }

    public boolean isEven()
    {
        if(x%2 == 0)
            return true;
        else
            return false;
    }

    public boolean isOdd()
    {
        if(x%2 != 0)
            return true;
        else
            return false;
    }
}

public class Q21
{
    public static void main(String[] args) throws IOException
    {
        int x = Integer.parseInt(args[0]);

        MyNumber nb = new MyNumber(x);

        if(nb.isNegative())
            System.out.println(x+" is negative.");
        if(nb.isPositive())
            System.out.println(x+" is Positive.");
        if(nb.isEven())
            System.out.println(x+" is Even.");
        if(nb.isOdd())
            System.out.println(x+" is Odd.");
    }
}