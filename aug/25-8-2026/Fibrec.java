/*
Program to find nth fibonacci number using recursion
Assume Fibonacci Series as 0 1 1 2 3 5 8 13 21 34 55 ......

Sample Input and Output:
input=8
output=13

input=4
output=2
*/
import java.util.*;
class Fibrec
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(recfib(n));
    }
    public static int recfib(int n)
    {
        if(n==1)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        return recfib(n-1)+recfib(n-2);
    }
}
