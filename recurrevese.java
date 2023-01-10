import java.util.*;
public class recurrevese {
    static int sum=0;
    public static void main(String args[]){
        int x=153;
        reve(x);
        System.out.println(sum);
        System.out.println((int)(Math.log10((int) x+1)));
    }
    public static void reve(int x){
        if(x==0){
            return ;
        }
        sum=sum*10+x%10;
        reve(x/10);


    }
    
}
