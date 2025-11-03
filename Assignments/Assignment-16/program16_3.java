// Write a program to find factorial of a number

class Logic 
{
    void findFactorial(int num)
    {
        int iCnt = 0;
        int iFactorial = 1;

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            iFactorial = iFactorial * iCnt;
        }

        System.out.println("Factorial is: " + iFactorial);
    }
}

class Program
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.findFactorial(5);    
    }
}