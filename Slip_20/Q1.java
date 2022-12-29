import java.util.*;
import java.io.*;

public class Q1
{
    public static void main(String args[])
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        if (x >= y)
        {    //In the three responses below, y is always before x.  
            if (y >= z)
                System.out.print("In order " + z + " "+ y + " " + x);

            else if  (z >= x)
                System.out.print("In order " + y + " "+ x + " " + z);

            else if (x > z)
                System.out.print("In order " + y + " " + z + " " + x);
        }

        if (y > x)
        {   // In the three responses below, x is always before y
            if (z >= y)
                System.out.print("In order " + x + " " + y + " "+ z);
            else if (z >= x)
                //System.out.print("In order " + y + " " + x + " " + z); //In this case, z has to be smaller than y.  The order was off
                System.out.print("In order " + x + " " + z + " " + y);
            else if (x > z)
                //System.out.print("In order " + y + " " + z + " " + x);
                System.out.print("In order " + z + " " + x + " " + y); //Y is the biggest.  The order here was off.
        }
    }
}