import java.util.*;
import java.io.*;


public class Q1
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();

        //name = name.toUpperCase();

        System.out.println("\"Hello, " + name.toUpperCase() + ", nice to meet you!\"");
    }
}