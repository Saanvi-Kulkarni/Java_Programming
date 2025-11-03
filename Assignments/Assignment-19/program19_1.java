// Write a program to check whether a given year is leap year or not

class Logic
{
    void checkLeapYear(int year)
    {
        if((year % 4) == 0)
        {
            System.out.println(year + " is Leap Year");
        }
        else 
        {
            System.out.println(year + " is not a Leap Year");
        }
    }
}

class Program
{
    public static void main(String[] args) 
    {
        Logic obj =  new Logic();
        obj.checkLeapYear(2024);
    }
}