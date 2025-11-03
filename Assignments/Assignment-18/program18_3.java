// // Write a program to print odd nos upto N

class Logic
{
    void printOddNumbers(int n)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2) != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program
{
    public static void main(String[] args) 
    {
        Logic obj =  new Logic();
        obj.printOddNumbers(20);
    }
}