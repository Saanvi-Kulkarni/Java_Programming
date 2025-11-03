// Write a program to check whether a number is divisible by 5 an 11 or not

class Logic
{
    void checkDivisible(int num)
    {
        if(((num % 5) == 0) && ((num % 11) == 0))
        {
            System.out.println(num + " is Divisible by 5 and 11");
        }
        else 
        {
            System.out.println(num + " is not Divisible by 5 and 11");
        }
    }
}

class Program
{
    public static void main(String[] args) 
    {
        Logic obj =  new Logic();
        obj.checkDivisible(55);
    }
}