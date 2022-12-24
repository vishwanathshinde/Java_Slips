package series;

public class Square
{
    public Square()
    {
    }

    public Square(int n)
    {
        System.out.println("Square of the number is: "+ n*n);
    }

    public void fibonacci(int n)
    {
        int first=0, second=1, c, next;
        System.out.println("Fibonacci Series: ");
        for(int i=0; i<=n; i++)
        {
            if(i<=1)
                next=i;
            else
            {
                next = first + second;
                first=second;
                second=next;
            }
            System.out.println(next);
        }
    }
}