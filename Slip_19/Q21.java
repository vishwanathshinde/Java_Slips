import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Order
{
    String id, description;
}

class PurchaseOrder extends Order
{
    String Customername, Vendorname;
    public void accept() throws IOException
    {
        System.out.println("Enter the id,description,names of customers and vendors: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        id = br.readLine();
        description = br.readLine();
        Customername = br.readLine();
        Vendorname = br.readLine();
    }
    public void display()
    {
        System.out.println("id: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customername: " + Customername);
        System.out.println("Vendorname: " + Vendorname);
        System.out.println("----------------------");
    }
}

public class Q21
{
    public static void main(String[] args) throws IOException
    {

        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of purchase Orders: ");
        int n = Integer.parseInt(br.readLine());
        PurchaseOrder[] l = new PurchaseOrder[n];
        for (i = 0; i < n; i++)
        {
            l[i] = new PurchaseOrder();
            l[i].accept();
        }
        for (i = 0; i < n; i++)
        {
            l[i].display();
            System.out.println("Object is created");
        }
    }
}