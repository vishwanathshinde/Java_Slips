import java.util.*;
import java.io.*;

class Product
{
    public int id, price;
    public String name;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void accept() throws IOException
    {
        System.out.print("Enter product name: ");
        name = br.readLine();
        System.out.print("Enter product id: ");
        id = Integer.parseInt(br.readLine());
        System.out.print("Enter product price: ");
        price = Integer.parseInt(br.readLine());
        System.out.println("------------------------");
    }

    public void display()
    {
        System.out.println("Product price is: " + price);
    }

    public void minprice(Product P[], int n)
    {
        int min , pos1=0;
        min = P[0].price;

        for(int i=0; i<n; i++)
        {
            if(min > P[i].price)
            {
                min = P[i].price;
                pos1 = i;
            }
        }
        System.out.println("Name of product having minimum price is: \n");
        P[pos1].display();
    }
}

public class Q21
{
    public static void main(String[] args) throws IOException
    {
        Product P[] = new Product[5];

        for(int i=0; i<P.length; i++)
        {
            P[i] = new Product();
            P[i].accept();
        }
        for(int i=0; i<P.length; i++)
        {
            P[i].minprice(P,5);
        }
    }
}