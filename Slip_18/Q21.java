import java.util.*;
import java.io.*;

public class Q21
{
    public static void main(String[] args)
    {
        String filename;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of file with extension: ");
        filename = sc.nextLine();

        String line = null;

        try
        {
            FileReader filereader = new FileReader(filename);
            //always wrap the FileReader in BufferedReader 
            BufferedReader bufferedreader = new BufferedReader(filereader);

            while((line = bufferedreader.readLine()) != null) 
            {
                System.out.println(line.toUpperCase());
            }

            bufferedreader.close(); // always close the file after its use
        }
        catch(Exception e)
        {
            System.out.println("\nError occurred");
            System.out.println("Exception Name: " +e);
        }
    }
}