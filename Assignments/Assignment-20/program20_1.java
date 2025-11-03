// Write a program to find the sum of all even numbers upto N

class Logic
{
    void sumEvenNumbers(int n)
    {
        int iCnt = 0;
        int iSumEven = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iSumEven = iSumEven + iCnt;
            }
        }

        System.out.println(iSumEven);
    }
}

class Program
{
    public static void main(String[] args) 
    {
        Logic obj =  new Logic();
        obj.sumEvenNumbers(10);
    }
}