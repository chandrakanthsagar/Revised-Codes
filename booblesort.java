import java.util.*;
public class booblesort{
    public static void bubblesort(int arr[]){
        int n=arr.length;
        boolean flag=false;
        int c=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                     arr[j+1]=temp;
                    c++;
                    flag=true;
                }
            }
            if(flag=false)
                break;
        }
        System.out.println(c);
    }
    public static void swap(int x,int y,int arr[]){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String args[]){
        int arr[]={176, -272 ,-272, -45, 269 ,-327 ,-945 ,176};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
