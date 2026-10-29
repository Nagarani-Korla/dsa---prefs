
/*
Program to find nth fibonacci number using iteration
Assume Fibonacci Series as 0 1 1 2 3 5 8 13 21 34 55 ......

Sample Input and Output:
input=8
output=13

input=4
output=2
*/
import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n)
    {
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<=n;i++)
        {
           c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}