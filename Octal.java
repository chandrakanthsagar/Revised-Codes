import java.util.*;
public class Octal{
    public static void main(String args[]){
        int a=8;
        

        Stack<Integer> k=new Stack<>();
        
        while(a>0){
            k.push(a%8);
            a=a/8;
        }
        while(!k.empty()){
            System.out.print(k.pop());
        }
        
    }
}
