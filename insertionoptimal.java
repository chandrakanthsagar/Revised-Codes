//We know when to use Binary search i.e. when we do have a starting index and ending index we can do that 
// In insertion we know it is based on before key value sorted and remaining side unsorted 
// 
import java.util.*;
public class insertionoptimal{
 public static void insertionsort(int a[]){
     int n=a.length;
     for(int i=1;i<n;i++){
         int key=a[i];
         int j=i-1;
         int loc=binarysearch(a,key,0,j);
         while(j>=loc){
             a[j+1]=a[j];
             j=j-1;
         }
         a[j+1]=key;
     }
 }
 public static int binarysearch(int a[], int key, int low, int high){
     while(low<=high){
         int mid=(low+high)/2;
         if(key==a[mid])
             return mid+1;
         else if(key>a[mid]){
             low=mid+1;
         }
         else{
             high=mid-1;
         }
     }
     return low;
 }
  
    public static void main(String args[]){
        int arr[]={8,2,1,4,9,7};
        insertionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
