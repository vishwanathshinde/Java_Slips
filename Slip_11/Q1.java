import java.util.*;
import java.io.*;

public class Q1
{
    int dd, mm, yy;

    public Q1()
    {
    }
    public Q1(int dd, int mm, int yy)
    {
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
    }
    public void display()
    {
        System.out.println("Date is: "+dd+"-"+mm+"-"+yy);
    }
    public static void main(String[] args) throws Exception
    {
        Q1 m1 = new Q1();
        Q1 m2 = new Q1(9,12,2002);
        m2.display();
    }
}