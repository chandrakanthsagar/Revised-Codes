import java.util.*;
public class SLL {
    int size=0;
    Node head;
    Node tail;
    SLL(){
        this.size=0;
    }

   

    public class Node{
        Node head;
        Node tail;

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
        public void display(){
            Node temp=head;
            System.out.println("HEAD");
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println("null");

        }
    
    public void insertbegin(int data){
        Node newnode=new Node(data);
        if(head==null){
          head=newnode;
          tail=newnode;
        }
        else{
        newnode.next=head;
        head=newnode;
        }
     size++;

        

    }
    public void insertLast()


    


    




    public static void main(String args[]){
        SLL o=new SLL();
        
        o.insertbegin(5);
        o.insertbegin(12);
        o.insertbegin(22);
        o.display();
        o.insertbegin(45);
        o.insertbegin(199);
        o.display();
    }

}


    


    
