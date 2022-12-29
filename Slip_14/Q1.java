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
            c = DriverManager.getConnection("jdbc2:postgresql://192.168.5.200/bcaty50","bcaty50","");
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