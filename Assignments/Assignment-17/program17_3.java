// Write a program to find maximum of two numbers

class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.err.println(a + " is Max");
        }
        else
        {
            System.out.println(b + " is Max");
        }
    }
}

class Program
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
        
    }
}