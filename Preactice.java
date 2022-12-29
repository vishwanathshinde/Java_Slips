import java.util.*;
import java.io.*;

public class Preactice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String filename = sc.nextLine();

        String line;
        try
        {
            FileReader filereader = new FileReader(filename);
            FileWriter filewriter = new FileWriter("NewBall.txt");
            //Always wrap the file reader in buffered reader
            BufferedReader bufferedreader = new BufferedReader(filereader);

            while((line = bufferedreader.readLine()) != null)
            {
                System.out.println(line.toUpperCase());
                filewriter.write(line.toUpperCase());
            }

            bufferedreader.close();
            filewriter.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}