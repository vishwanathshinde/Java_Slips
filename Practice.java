import java.util.*;
import java.io.*;

class InvalidDateException extends Exception
{

}

class MyDate
{
    int day , month, year;

    void accept(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    void display()
    {
        System.out.println("Date is valid : " + day + "/" + month + "/" + year);
    }
}

public class Practice
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a day: ");
        int day = Integer.parseInt(br.readLine());
        System.out.println("Enter a month: ");
        int month = Integer.parseInt(br.readLine());
        System.out.println("Enter a year: ");
        int year = Integer.parseInt(br.readLine());

        int flag = 0;

        try
        {
            if(month<=0 || month>12)
                throw new InvalidDateException();
            else
            {
                if( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
                {
                    if(day<1 || day>31)
                        throw new InvalidDateException();
                    else
                        flag = 1;
                }

                else if( month == 2)
                {
                    if(year%4==0)
                    {
                        if(day<1 || day>29)
                            throw new InvalidDateException();
                        else
                            flag = 1;
                    }
                    else
                    {
                        if(day<1 || day>28)
                            throw new InvalidDateException();
                        else
                            flag = 1;
                    }
                }

                else
                {
                    if(month == 4 || month == 6 || month == 9 || month == 11)
                    {
                        if(day<1 || day>30)
                            throw  new InvalidDateException();
                        else
                            flag = 1;
                    }
                }
            }

            if (flag == 1)
            {
                MyDate dt = new MyDate();
                dt.accept(day, month, year);
                dt.display();
            }
        }
        catch(InvalidDateException e)
        {
            System.out.println("Date is invalid !");
        }
    }
}