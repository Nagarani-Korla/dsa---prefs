/*
Java Program to add 2 matrices

Sample Input and Output
input=
3 2 //order of I matrix 
3 2 //order of II matrix
//values of first matrix
10 20
30 40
50 60
//values of second matrix
1 2
3 4
5 6
output=
11 22 
33 44 
55 66 

input=
2 2 
3 2
output=
Addition is not possible

*/
import java.util.*;
class MatrixAdd
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int r1=s.nextInt();
        int c1=s.nextInt();
        int r2=s.nextInt();
        int c2=s.nextInt();
        if(r1==r2 && c1==c2)
        {
            int a[][]=new int[r1][c1];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    a[i][j]=s.nextInt();
                }
            }
            int b[][]=new int[r2][c2];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    b[i][j]=s.nextInt();
                }
            }
            int sum[][]=new int[r2][c2];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    sum[i][j]=a[i][j]+b[i][j];
                }
            }
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Addition is not possible");
        }
    }
}