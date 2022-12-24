import java.io.*;

class Point
{
    int x, y;

    Point()
    {
        x=0;
        y=0;
    }
    Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public void display()
    {
        System.out.println("Co-ordinate of x and y is: "+ x + "," + y);
    }
}

class ColorPoint extends Point
{
    String color;
    ColorPoint(int x, int y, String color)
    {
        super(x,y);
        this.color=color;
    }
    public void display()
    {
        System.out.println("Co-ordinates of x and y are: "+ x + " "+y);
        System.out.println("Color is: "+color);
    }
}

public class Q21
{
    public static void main(String[] args)
    {
        Point p = new Point(5,5);
        p.display();
        ColorPoint cp = new ColorPoint(5,5,"Red");
        cp.display();
    }
}