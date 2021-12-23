package Tutorial4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo03
{
    private String month;
    private int day;
    private int year;

    public void writeOutput()
    {
        System.out.println(month+", "+day+", "+year);
    }

    public void readInput() throws IOException
    {
        boolean tryAgain = true;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        while (tryAgain)
        {
            System.out.println("Enter month, day, and year on three lines");
            System.out.println("Enter month, day, and year as three integer");
            int monthInput = Integer.parseInt(keyboard.readLine());
            int dayInput = Integer.parseInt(keyboard.readLine());
            int yearInput = Integer.parseInt(keyboard.readLine());
            if (dateOK(monthInput, dayInput, yearInput))
            {
                setDate(monthInput, dayInput, yearInput);
                tryAgain = false;
            }
            else
                System.out.println("Illegal date. Reenter input.");
        }
    }

    public void setDate(int month, int day, int year)
    {
        if(dateOK(month, day, year))
        {
            this.month = monthString(month);
            this.day = day;
            this.year = year;
        }
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public void setMonth(int monthNumber)
    {
        if((monthNumber <= 0)||(monthNumber > 12))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            month = monthString(monthNumber);
    }

    public void setDay(int day)
    {
        if((day <= 0)||(day > 31))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.day = day;
    }

    public void setYear(int year)
    {
        if((year < 1000)||(year > 9999))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.year = year;
    }

    public boolean dateOK(int monthInt, int dayInt, int yearInt)
    {
        return ((monthInt >= 1) && (monthInt <=12) && (dayInt >= 1) && (dayInt <= 31) && (yearInt >= 1000) && (yearInt <= 9999));
    }

    public boolean equals(Demo03 otherDate)
    {
        return ((month.equals(otherDate.month))) && (day == otherDate.day) && (year == otherDate.year);
    }

    private String monthString(int monthNumber)
    {
        return "month";
    }

    public int getDay()
    {
        return day;
    }

    public int getYear()
    {
        return year;
    }

    public int getMonth()
    {
        if(month.equals("Jan"))
            return 1;
        else if (month.equals("Feb"))
            return 2;
        else if (month.equals("Mar"))
            return 3;
        else if (month.equals("Apr"))
            return 4;
        else if (month.equals("May"))
            return 5;
        else if (month.equals("Jun"))
            return 6;
        else if (month.equals("Jul"))
            return 7;
        else if (month.equals("Aug"))
            return 8;
        else if (month.equals("Sep"))
            return 9;
        else if (month.equals("Oct"))
            return 10;
        else if (month.equals("Nov"))
            return 11;
        else if (month.equals("Dec"))
            return 12;
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
            return 0;
        }
    }
}
