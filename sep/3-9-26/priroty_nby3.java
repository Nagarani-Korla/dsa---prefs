/*
Given an integer array of size n, find all elements that appear more than n / 3 times.

Example 1:
Input: 3
3 2 3
Output: [3]

Example 2:
Input: 1
1
Output: [1]

Example 3:
Input: 2
1 2
Output: [1,2]
*/
import java.util.*;
public class priroty_nby3{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println((app_1(arr,n)));
    }
    public static ArrayList<Integer> app_1(int arr[],int n){
        HashMap<Integer,Integer>  map = new HashMap<>();
        ArrayList <Integer> result = new ArrayList<>();
        for(int x:arr){
           map.put(x,map.getOrDefault(x,0)+1);
           if(map.get(x)>n/3 && !(result.contains(x))){
                result.add(x);
           }

        }
        return result;
    }
}