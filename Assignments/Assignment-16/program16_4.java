// Write a program to reverse a number

class Logic
{
    int reverseNumber(int iNo)
    {
        int iDigit = 0;
        int iRev = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit; 

            iNo = iNo / 10;
        }

        return iRev;
    }
}

class Program
{
    public static void main(String args[])
    {
        int iRet = 0;

        Logic obj = new Logic();
        iRet = obj.reverseNumber(1234);

        System.out.println("Reverse number: " + iRet);
    }
}