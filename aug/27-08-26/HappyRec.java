/*
A number is called Happy if repeatedly replacing the number by the 
sum of the squares of its digits eventually reaches 1. 
Write a java program to check whether a number is happy or not using recursion
Sample Input and Output:
input=19
output=true

input=18
output=false

Example
19 -> 1²+9²=82
82 -> 8²+2²=68
68 -> 6²+8²=100
100-> 1²+0²+0²=1
Happy Number
*/
import java.util.*;
class HappyRec
{
    public static boolean rec(int n,HashSet set)
    {
        if(n==1)
        {
            return true;
        }
        if(set.contains(n))
        {
            return false;
        }
        set.add(n);
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r*r;
            n=n/10;
        }
        n=sum;
        return rec(n,set);
        
    }
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        HashSet<Integer> set=new HashSet<>();
        System.out.println(rec(n,set));
    }