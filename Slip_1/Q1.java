import java.util.*;

class Q1
{
    public static void main(String args[])
    {
        int a;
        a = Integer.parseInt(args[0]);

        for(int i=0; i<11; i++)
        {
            System.out.println(a + "*" + i + "=" + a*i);
        }
    }
}