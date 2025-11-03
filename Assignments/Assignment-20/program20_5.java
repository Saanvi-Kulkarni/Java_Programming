// Write a program to find the smallest digit in a given number

class Logic
{
    void findSmallestDigit(int iNo)
    {
        int iDigit = 0;
        int iMin = 9;

        while (iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Smallest digit is: " + iMin);
    }
}

class Program
{
    public static void main(String[] args) 
    {
        Logic obj =  new Logic();
        obj.findSmallestDigit(45872);
    }

}

