// Write a program to count the number of digits in a given number

class Logic
{
    int countDigits(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo == 0)
        {
            return 1;
        }

        int iDigit = 0;
        int iCount = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iCount ++;

            iNo = iNo / 10;
        }

        return iCount;
    }
}

class Program 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        int iRet = obj.countDigits(7865);
        System.out.println("Number of digits are: " + iRet);
    }
}