import java.io.*;
import java.util.*;

public class oposite {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                
                
            }
            
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
                
                
            }
            
        }
        

        
        
        


         for(int i=0;i<m;i++){
             int count1=0;
             int count2=0;
            for(int j=0;j<n;j++){
               count1=count1+a[i][j];
                count2=count2+b[m-1-i][j];
                
                
            }
            System.out.println(count1);
            System.out.println(count2);
            System.out.println(count1+count2);
           
            
        }
        
    }
}