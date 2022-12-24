import java.util.*;

abstract class Shape
{
    double pi= 3.14;
    abstract void area();
    abstract void volume();
}

class Cylinder extends Shape
{
    double r , h;

    Cylinder(double r, double h)
    {
        this.r=r;
        this.h=h;
    }

    void area()
    {
        System.out.println("Area of Cylinder is: "+ (pi*r*r*h));
    }

    void volume()
    {
        System.out.println("Volume of Cylinder is: "+(2*pi*r*h+2*pi*r*r));
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        Shape s;
        Cylinder cy = new Cylinder(5,5);
        cy.area();
        cy.volume();
    }
}