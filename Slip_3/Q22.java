import java.util.*;
import java.io.*;

public class Q22
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("Ball.txt");

        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream("NewBall.txt");

        int value;

        while((value = fis.read()) != -1)
        {
            System.out.print((char)value);
            if(Character.isLowerCase(value))
            {
                fos.write((int)Character.toUpperCase(value));
            }
            //fos.write(value.toUpperCase());
        }
        fis.close();
        fos.close();
        System.out.println("\nSuccessfully Copied!");
    }
}