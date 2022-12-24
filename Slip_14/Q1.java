import java.sql.Connection;
import java.sql.DriverManager;

public class Q1
{
    public static void main(String[] args)
    {
        Connection c = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/TempDb","mkyong","123456");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getClass().getName()+": "+e.getMessage());
        }
        if(c != null)
        {
            System.out.println("Opened Database Successfully!");
        }
        else
        {
            System.out.println("Failed to make connection!");
        }
    }
}