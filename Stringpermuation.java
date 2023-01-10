import java.util.ArrayList;

public class Stringpermuation {
    public static void main(String arg[]){
       String y="he" ;
       StringBuilder x=new StringBuilder(y);
       ArrayList<String> o=new ArrayList<>();
       
       recurpermutate(x,0,o);
       for(int i=0;i<o.size();i++){
        System.out.println(o.get(i));
       }
    
    }
    public static ArrayList<String> recurpermutate(StringBuilder x,int index,ArrayList<String> o){
        
        if(index==x.length()){
            
            String y="";
            for(int i=0;i<x.length();i++)
            {
                y=y+x.charAt(i);
            }
            System.out.println(y);
            
        
        return o;
        }
        for(int i=index;i<x.length();i++){
            swap(i,index,x);
            recurpermutate(x,index+1,o);
            swap(i,index,x);
        }
        return o;
        
         

    }
    public static void swap(int p,int q,StringBuilder x){
        char t=x.charAt(p);
        x.setCharAt(p,x.charAt(q));
        x.setCharAt(q, t);

    }
}
