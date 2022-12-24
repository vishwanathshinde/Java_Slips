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
        {
            if (y >= z)
                System.out.print("In order " + z + " "+ y + " " + x);

            if  (z >= x)
                System.out.print("In order " + y + " "+ x + " " + z);

            if (x > z)
                System.out.print("In order " + y + " " + z + " " + x);
        }

        if (y > x)
        {
            if (z >= y)
                System.out.print("In order " + x + " " + y + " "+ z);
            if (z >= x)
                System.out.print("In order " + y + " " + x + " " + z);
            if (x > z)
                System.out.print("In order " + y + " " + z + " " + x);
        }
    }
}