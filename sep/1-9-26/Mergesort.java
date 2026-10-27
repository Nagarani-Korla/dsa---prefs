/*
Java Program to sort a set of values using Merge Sort
Sample Input and Output:
Input:
10
42 23 74 11 65 58 94 36 99 87
Output:11 23 36 42 58 65 74 87 94 99
*/
import java.util.*;
public class Mergesort{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i ] = s.nextInt();
        }
        merge_sort(arr,0,n-1); // 0 based kada so n- 1
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void merge_sort(int arr [], int low , int high){
        if(low<high){
            int mid = low + (high - low )/2;
            merge_sort(arr, low , mid );
            merge_sort(arr, mid +1, high);
            merge(arr,low, mid, high);
        }
        return; // idhi low >= high ayithe , more importantly = kosam anukoo 
    }
    public static void merge(int arr[], int low, int mid , int high ){
        int temp[] = new int[high-low +1]; // deni size kosam itla anntey eppudu change ayithadi kada 
        int left = low, right = mid+1;
        int current = 0;
        while(left <= mid && right<= high){
            if(arr[left] <= arr[right]){
                temp[current]  = arr[left];
                current++; left ++;
            }
            else{
                temp[current] = arr[right];
                current ++; right++;
            }
        }
        // leftovers of left half
        while(left<= mid){
            temp[current] = arr[left];
            left++; current++; 
        }
        // leftovers of right half
        while(right <= high){
            temp[current] = arr[right];
            right++; current++;
        }
        // copy back - most teeda 
        for(int i=0;i<temp.length;i++){
            arr[low +i] = temp[i];  // idhi deeni actual position , check in dry run ( no other option )
        }
    }
    /* chudaniki arary list tesukunntey simple ayithadi   
    enduku anntey current,inka size gurinchi think cheyalisna avasaram unndadu 
    public static void merge(int arr[], int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low, right = mid + 1;

    while (left <= mid && right <= high) {
        if (arr[left] <= arr[right]) temp.add(arr[left++]);
        else                         temp.add(arr[right++]);
    }
    while (left <= mid)   temp.add(arr[left++]);
    while (right <= high) temp.add(arr[right++]);

    for (int i = 0; i < temp.size(); i++) {
        arr[low + i] = temp.get(i);   // note: .get(i), and size() not length
    }
}*/
}