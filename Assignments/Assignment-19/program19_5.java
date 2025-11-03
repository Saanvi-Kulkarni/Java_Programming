// Write a program to calculate power of a number using loops

class Logic
{
    void calculatePower(int base, int exp)
    {
        int iCnt = 0;
        int iResult = 0;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iResult = iResult + base;
        }

        System.out.println(base + " raised to the power " + exp + " is: " + iResult);
    }
}

class Program
{
    public static void main(String[] args) 
    {
        Logic obj =  new Logic();
        obj.calculatePower(2, 5);
    }
}