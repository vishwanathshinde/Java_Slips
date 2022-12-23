import java.util.*;
import java.io.*;

public class Q1
{
    public static void main(String args[]) throws IOException
    {
        int a = Integer.parseInt(args[0]);
        int n, rev=0;

        while(a!=0)
        {
            n = a % 10;
            rev = n + rev * 10;
            a = a/10;
        }
        System.out.println("Reverse: "+rev);
    }
}