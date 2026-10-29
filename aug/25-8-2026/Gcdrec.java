/*
Program to find the GCD/HCF of 2 positive values using recursion

Sample Input and Output:
input=7 49
output=7

input=456 123
output=3

*/
import java.util.*;
class Gcdrec
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(recgcd(a,b));
    }
    public static int recgcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return(recgcd(b,a%b));
    }
}
