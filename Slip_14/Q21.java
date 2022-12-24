import java.util.*;
import java.io.*;

interface Operation
{
    double pi = 3.142;
    double area();
    double volume();
}

class Cylinder implements Operation
{
    double r, h;

    Cylinder(double r, double h)
    {
        this.r=r;
        this.h=h;
    }

    public double area()
    {
        return 2*pi*r*h+2*pi*r*r;
    }

    public double volume()
    {
        return pi*r*r*h;
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        Operation op;
        Cylinder cy = new Cylinder(5,5);
        System.out.println("Area: "+cy.area());
        System.out.println("Volume: "+cy.volume());
    }
}