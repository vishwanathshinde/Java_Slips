import java.util.*;
import java.io.*;

class Point
{
    int x, y;

    Point()
    {
    }

    Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}

class Point3D extends Point
{
    int z;

    Point3D(int x, int y, int z)
    {
        super(x,y);
        this.z=z;
    }

    public void display()
    {
        System.out.println("Co-ordinates of x, y, z are: "+x+", "+y+", "+z);
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        Point3D pt = new Point3D(2,4,6);
        pt.display();
    }
}