import java.util.*;
public class pattern123 {
    public  static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        
        for(int i=1;i<n;i++){
            int a=i;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                if(j<=i){
                    System.out.print((char)(j+'A'-1));
                }
                else{
                    a=a-1;
                    System.out.print((char) (a+'A'-1));
                }
            }
            System.out.println("");
        }
    }
    }
    