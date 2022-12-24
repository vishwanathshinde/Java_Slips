import java.util.*;
import java.io.*;

abstract class Shape        //abstract class
{
    double pi = 3.14;
    abstract void area();   //abstract method
    abstract void volume();   //abstract method
}

class Sphere extends Shape
{
    double r;

    Sphere(double r)
    {
        this.r = r;
    }

    void area()         //implementing abstract method
    {
        System.out.println("Area of Sphare: "+(4*pi*r*r));
    }

    void volume()       //implementing abstract method
    {
        System.out.println("Volume of Sphere: "+((4.0/3.0)*pi*(r*r*r)));
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        Shape s;
        Sphere sp = new Sphere(5);
        sp.area();
        sp.volume();
    }
}