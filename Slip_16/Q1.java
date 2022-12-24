import java.util.*;

class myNumber
{
    private int x;

    public myNumber()
    {
    }

    public myNumber(int x)
    {
        this.x=x;
    }

    public boolean isEven()
    {
        if(x % 2 == 0)
            return true;
        else
            return false;
    }
}

public class Q1
{
    public static void main(String args[])
    {
        int x = Integer.parseInt(args[0]);
        myNumber nb = new myNumber(x);
        if(nb.isEven())
            System.out.println(x+" is Even.");
    }
}