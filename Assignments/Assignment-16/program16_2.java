// Write to program to check whether given number is even or odd

class Logic
{
    void CheckEvenOdd(int num)
    {
        if((num % 2) == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}

class Program
{
    public static void main(String[] args) 
    {
       Logic obj = new Logic();
       obj.CheckEvenOdd(7); 
    }
}