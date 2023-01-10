
import java.util.*;
public class GFG
{
	public static void main(String[] args) {
	    int arr[] = {12, 11, 13, 5, 6};
	    insertionSortRecursive(arr, arr.length);
         
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
	}
	public static void insertionSortRecursive(int arr[],int n){
	    if(n<=1){
	        return;
	    }
	    insertionSortRecursive(arr,n-1);
	    
	    int key=arr[n-1];
	    int j=n-2;
	    int loc=Binarysearch(arr,key,0,j);
	    while(j>=loc){
             arr[j+1]=arr[j];
             j=j-1;
         }
         arr[j+1]=key;
	}
	public static int Binarysearch(int arr[],int key,int l,int h){
	    while(l<=h){
	        int mid=l+h/2;
	        if(arr[mid]<key){
	            l=mid+1;
	        }
	        else if(arr[mid]==key){
	            return mid+1;
	            
	        }
	        else{
	            h=mid-1;
	        }
	    }
	    return l;
	}
}
