// Write a program to find the largest digit in a given number

class Logic
{
    void findLargestDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Largest digit is: " + iMax);
    }
}

class Program
{
    public static void main(String[] args) 
    {
        Logic obj =  new Logic();
        obj.findLargestDigit(83429);
    }
}