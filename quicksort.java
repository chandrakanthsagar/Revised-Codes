import java.util.*;
public class quicksort {
    public static void main(String args[]){
    int a[]={23,31,1,21,36,72};
    quicksort(a,0,a.length-1);
    for(int i=0;i<a.length;i++){
        System.out.printf("%d ",a[i]);
    }
}
public static void quicksort(int a[],int left,int right){

    int pivotindex=partion(a,left,right);
    if(left<pivotindex-1)
    quicksort(a, left, pivotindex-1);
    if(right>pivotindex)
    quicksort(a, pivotindex, right);


}
public static int  partion(int a[],int left,int right){

    int pivot=a[left];
    while(left<right){
        //searching left elements greater than pivot element 
        while(a[left]<pivot){
            left++;
        }
        // searching right elements lesser than pivot element
        while(a[right]>pivot){
            right--;
        }
        // swaping the values 
        if(left<=right){
            int te=a[left];
            a[left]=a[right];
            a[right]=te;
            // increament left index and decrement the right index;
            left++;
            right--;
        }
    }
    return left;

}
}
