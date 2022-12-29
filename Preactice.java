import java.io.*;

public class Preactice
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Your name: ");
        String name = br.readLine();

        name = name.toUpperCase();

        System.out.println("\"Hello, " + name + ", nice to meet you!\"");
    }
}