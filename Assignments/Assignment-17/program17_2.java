// Write a program to check whether a number is palindrome or not

class Logic
{
    void checkPalindrome(int iNo)
    {
        int iDigit = 0;
        int iReverse = 0;
        int iNumber = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iReverse = (iReverse * 10) + iDigit;

            iNo = iNo / 10;

        }

        if(iReverse == iNumber)
        {
            System.err.println(iNumber + " is a Palindrome");
        }
        else
        {
            System.err.println(iNumber + " is not a Palindrome");
        }
    }
}

class Program
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}