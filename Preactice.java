import java.util.*;
import java.io.*;

public class Preactice
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers: ");
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

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