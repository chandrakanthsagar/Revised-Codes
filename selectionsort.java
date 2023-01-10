
public class selectionsort{
  public static void selectionsort(int arr[]){
      int n=arr.length;
      for(int i=0;i<n-1;i++){
          int max=arr[i];
          int index=i;
          for(int j=i+1;j<n;j++){
              if(arr[j]>max){
                  max=arr[j];
                  index=j;
                
                  
              }
              
          }
          System.out.print(index);
          swap(index,i,arr);
      }
  }
      public static void swap(int x,int y,int arr[]){
          int temp=arr[x];
          arr[x]=arr[y];
          arr[y]=temp;
      }
  
    public static void main(String args[]){
        int arr[]={5,3,1,5};
        selectionsort(arr);
     
    }
}