// // Write a program to find the sum of even and odd digitd separately

class Logic
{
    void sumEvenOddDigits(int n)
    {
        int iDigit = 0;
        int iSumEven = 0;
        int iSumOdd = 0;

        while(n != 0)
        {
            iDigit = n % 10;

            if((iDigit % 2) == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }

            n = n / 10;
        }

        System.out.println("Sum of even digits: " + iSumEven);
        System.out.println("Sum of odd digits: " + iSumOdd);
    }
}

class Program
{
    public static void main(String[] args) 
    {
        Logic obj =  new Logic();
        obj.sumEvenOddDigits(123456);
    }
}