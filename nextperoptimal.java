import java.util.*;
public class nextperoptimal {
    public static void main(String args[]){
    int a[]={1,2,3};
    nextpermutation(a);
    String x=Arrays.toString(a);// converting array to String;
    System.out.println(x);


}
public static  boolean nextpermutation(int a[]){

    int flag=-1;
    for(int i=a.length-2;i>=0;i--){
        if(a[i]<a[i+1]){
            flag=i;
            break;
        }
    }
    if(flag==-1){
        return false;
    }
    int flag2=-1;
    for(int i=a.length-1;i>=0;i--){
        if(a[i]>a[flag]){
            flag2=i;
            break;


        }
    }
    a=swap(a,flag,flag2);
    a=reverse(a,flag+1,a.length-1);//reversing array 


    return true;
}
public static int[] reverse(int a[],int flag,int last){
    while(flag<last){
        int temp=a[flag];
        a[flag++]=a[last];
        a[last--]=temp;
    }
    return a;
    
}

public static int[] swap(int a[],int flag,int flag2){
    int t=a[flag];
    a[flag]=a[flag2];
    a[flag2]=t;

return a;
}

}

