import utility.*;

import java.util.*;
import java.io.*;

public class Q21
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name in lower case: ");
        String name = br.readLine();
        System.out.println("Enter your city in lower case: ");
        String city = br.readLine();

        CapitalString cs = new CapitalString();
        cs.capital(name);
        System.out.println("City is: "+city);
    }
}