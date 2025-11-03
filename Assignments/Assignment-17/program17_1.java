// Write a program to find the sum of digits of a number

class Logic
{
    int sumOfDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;

            iNo = iNo / 10;

        }

        return iSum;
    }

}

class Program
{
    public static void main(String args[])
    {
        int iRet = 0;

        Logic obj = new Logic();
        iRet = obj.sumOfDigits(1234);

        System.out.println("Sum of Digits is: " + iRet);
    }
}