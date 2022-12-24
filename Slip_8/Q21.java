import java.util.*;
import java.io.*;

class InvalidDateException extends Exception
{

}

class MyDate
{
    int day, mon, yr;

    public void accept(int day, int mon, int yr)
    {
        this.day = day;
        this.mon = mon;
        this.yr = yr;
    }

    public void display()
    {
        System.out.println("Date is valid: "+day+"/"+mon+"/"+yr);
    }
}

public class Q21
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter day: ");
        int day = Integer.parseInt(br.readLine());
        System.out.println("Enter month: ");
        int mon = Integer.parseInt(br.readLine());
        System.out.println("Enter year: ");
        int yr = Integer.parseInt(br.readLine());

        int flag=0;

        try
        {
            if(mon<=0 || mon>12)
                throw new InvalidDateException();
            else
            {
                if(mon==1 || mon==3 || mon==5 || mon==7 || mon==8 || mon==10 || mon==12)
                {
                    if(day>=0 || day<=31)
                        flag = 1;
                    else
                        throw new InvalidDateException();
                }  

                else if(mon==2)
                {
                    if(yr%4==0)
                    {
                        if(day>=1 || day<=29)
                            flag=1;
                        else
                            throw new InvalidDateException();
                    }
                    else
                    {
                        if(day>=1 || day<=28)
                            flag = 1;
                        else throw new InvalidDateException();
                    }
                }

                else
                {
                    if(mon==4 || mon==6 || mon==9 || mon==11)
                    {
                        if(day>=1 || day<=30)
                            flag =1;
                        else
                         throw new InvalidDateException();
                    }
                }  
            }

            if(flag==1)
            {
                MyDate dt = new MyDate();
                dt.accept(day,mon,yr);
                dt.display();
            }
        }
        catch(InvalidDateException e)
        {
            System.out.println("Invalid date!");
        }
    }
}