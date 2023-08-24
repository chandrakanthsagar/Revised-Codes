// Insertion sort generally application pack game
import java.util.*;
public class insertionsort{
 public static void insertionsort(int a[]){
     int n=a.length;// assume that first element already sorted you key index start from 1 
  //(you need to check till first element where particular indx is greater than key
     for(int i=1;i<n;i++){
         int key=a[i];
         int j=i-1;
         while(j>=0 && a[j]>key){
             a[j+1]=a[j];
             j=j-1;
         }
         a[j+1]=key;
     }
 }
  
    public static void main(String args[]){
        int arr[]={8,2,1,4,9,7};
        insertionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
