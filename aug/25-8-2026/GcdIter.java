/*
Program to find the GCD/HCF of 2 positive values using Iteration

Sample Input and Output:
input=7 49
output=7

input=456 123
output=3

*/
import java.util.*;
class GcdIter
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b)
    {
        int min=Math.min(a,b);
        for(int i=min;i>=1;i--)
        {
            if((a%i==0) && (b%i==0))
            {
                return i;
            }
        }
        return 1;
    }
}