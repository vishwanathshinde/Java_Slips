import java.util.*;

public class Q1
{
    public static void main(String args[])
    {
        int x = Integer.parseInt(args[0]);

        System.out.print("Factors of " + x + " are: ");

        for(i=1; i<=x; i++)
        {
            if(x % i == 0)
            {
                System.out.println(i+" ");
            }
        }
    }
}