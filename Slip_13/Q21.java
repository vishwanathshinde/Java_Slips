import java.util.*;
import java.io.*;

interface Operation
{
    double pi = 3.14;
    double area();
    double volume();
}

class Circle implements Operation
{
    double r;

    Circle(double r)
    {
        this.r=r;
    }

    public double area()
    {
        return pi*r*r;
    }

    public double volume()
    {
        return 2*pi*r*r;
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        Operation op;
        Circle cr = new Circle(5);
        System.out.println("Area: "+cr.area());
        System.out.println("Volume: "+cr.volume());
    }
}