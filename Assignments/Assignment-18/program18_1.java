// Write a program to check whether a number is prime or not

class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0;

        for(iCnt = 2; iCnt <= (num / 2); iCnt++)
        {
            if((num %  iCnt ) == 0)
            {
                System.out.println(num + " is not a Prime Number");
                return;
            }
        }
         
        System.err.println(num + " is a Prime Number");
    }
}

class Program
{
    public static void main(String[] args) 
    {
        Logic obj =  new Logic();
        obj.checkPrime(11);
    }
}