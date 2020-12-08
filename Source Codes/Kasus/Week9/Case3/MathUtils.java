package Kasus.Week9.Case3;

public class MathUtils 
{
    public static int factorial(int n) throws IllegalArgumentException
    {
        if(n>=0 && n<=16)
        {
            int fac = 1;
            for (int i=n; i>0; i--)
            fac *= i;
            return fac;
        }
        else if(n < 0)
        {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        else
        {
            throw new IllegalArgumentException("Value is over the max value (16)");
        }
    }
}
