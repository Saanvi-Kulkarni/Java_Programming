// Program to Calculate sum of first N natural numbers

class Logic
{
    void CalculateSum(int n)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            iSum = iSum  + iCnt;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + iSum);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        obj.CalculateSum(10);
    }
}