import java.util.*;

public class Q1
{
    public static void main(String[] args)
    {
        LinkedList li =new LinkedList();
        li.add("Apple");
        li.add("Banana");
        li.add("Guava");
        li.add("Orange");
        System.out.println("LinkedList is: "+li);

        ListIterator itr = li.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}