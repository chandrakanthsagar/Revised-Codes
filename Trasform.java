import java.util.*;
public class Trasform{
    public static void main(String arg[]){
        String x="i am very good boy";
        String a[]=x.split(" ");
        String y="";
        for(int i=0;i<a.length;i++){
            int temp=(int)a[i].charAt(0);
            if(temp>=97){
            char o=(char)(temp-32);
            y=y+o+a[i].substring(1)+" ";}
            else{
                if(i==a.length-1){

                
                char o=(char)(temp);
                y=y+o+a[i].substring(1);   
                }
                else{
                    char o=(char)(temp);
                    y=y+o+a[i].substring(1);   
                }
            }
        }
        System.out.println(y);

    }
}