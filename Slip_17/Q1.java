import java.util.*;

class MyNumber
{
    private int x;
    public MyNumber()
    {
    }

    public MyNumber(int x)
    {
        this.x=x;
    }

    public boolean isOdd()
    {
        if(x%2 != 0)
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
        MyNumber nb = new MyNumber(x);
        if(nb.isOdd())
            System.out.println(x+"is odd number!");
    }
}