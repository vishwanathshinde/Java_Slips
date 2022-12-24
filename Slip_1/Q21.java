import java.util.*;

public class Q21
{
    public static void main(String[] args)
    {
        LinkedList ls = new LinkedList();
        ls.add("Red");
        ls.add("Blue");
        ls.add("Yellow");
        ls.add("Orange");
        System.out.println("\nLinkedList is: " + ls);

        ListIterator itr = ls.listIterator();

        System.out.println("\nElements of list are: \n");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("\nElements of list using reverse order: ");
        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }

        LinkedList vs = new LinkedList(ls);
        vs.add(2,"Pink");
        vs.add(3,"Green");
        System.out.println("\nElements of second list are: " + vs);
    }
}