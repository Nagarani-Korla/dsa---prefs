/*
Subrahmanyam is working with numbers
He is given a list of numbers, his task is to find the priority number. 
The priority number is the number that occured more than 'list.length/2' times.

You may assume that the list is non-empty 
and the priority number always exist in the array.

Input Format:
-------------
line-1: an integer N, list size.
line-2: N space separated integers, numbers in the list[].

Output Format:
--------------
An integer, the priority number of the set.


Sample Input-1:
---------------
2
3 2 3

Sample Output-1:
----------------
3


Sample Input-2:
---------------
7
2 2 1 1 1 2 2

Sample Output-2:
----------------
2
*/
import  java.util.*;
public class priority_number{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(app_1(arr,n));
        System.out.println(app_2(arr,n));
    }
    public static int app_1(int arr [], int n ){
        HashMap <Integer,Integer> m = new HashMap<>();
        for(int x : arr){
            m.put(x,m.getOrDefault(x,0)+1);
            if(m.get(x)>n/2){
                return x;
            }
        }
        return -1;
    }
    public static int app_2(int arr[],int n){
        int candidate = arr[0];
        int count = 0;
        for(int i=0;i<n;i++){
            int current_element = arr[i];
            if(count == 0){
                candidate = current_element;
                count = 1;
            }
            else if(candidate == current_element){
                count ++;
            }
            else {
                count --;
            }
        }
        return candidate;
    }
}