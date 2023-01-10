
import java.util.*;

public class permutation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        

        
        ArrayList<ArrayList<Integer>> k=null;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        k=repermutae(0,a,ans);
        for(int i=0;i<k.size();i++){
            System.out.println(k.get(i));
        }
        
        
        
    }
    
    private static ArrayList<ArrayList<Integer>> repermutae(int index,int a[],ArrayList<ArrayList<Integer>> k){
        if(index==a.length){
            ArrayList<Integer> d=new ArrayList<>();
            for(int i=0;i<a.length;i++){
                d.add(a[i]);
            }
            k.add(d);
            return k;
        }
        for(int i=index;i<a.length;i++){
            swap(i,index,a);
            repermutae(index+1,a,k);
            swap(i,index,a);
        }
        return k;
        
    }
    private static void swap(int i,int j,int a[]){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
