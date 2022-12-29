import java.util.*;
import java.io.*;

public class Preactice
{
    public static void main(String[] args)
    {
        LinkedList li = new LinkedList();
        li.add("Apple");
        li.add("Banana");
        li.add("Gauva");
        li.add("Orange");
        System.out.println(li);

        ListIterator itr = li.listIterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next()+"");
        }

        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }
    }
}