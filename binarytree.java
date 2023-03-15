import java.util.LinkedList;
import java.util.*;
public class binarytree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int data){
            val=data;
            left=right=null;

        }
    }
    public static void preoder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.val+" ");
        preoder(root.left);
        preoder(root.right);


     }
     public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder((root.left));
        System.out.print(root.val+" ");
        inorder(root.right);

     }
     public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
     }
    public static Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.val){
          
            root.left=insert(root.left,data);}
        else{
          
            root.right=insert(root.right, data);
        }return root;
        }
    public boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.val==key){
            return true;
        }
        if(root.val<key){
            return search(root.right, key);
        }
        else{
            return search(root.left,key);
        }
    }
    public static Node delete(Node root,int data){
        if(root==null){
            return root;
        }
        if(data<root.val){
            root.left=delete(root.left, data);
        }
        else if(data>root.val){
            root.right=delete(root.right,data);
        }
        else{
            if(root.left==null && root.right==null){
                return null;// root contains no children;
            }
// if node contains only one children;
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //node has two children;
            // get inorder successor(ie min value in the right sub tree)
            root.val=minValue(root.right);// swaping root value with least value of right subtree;
            root.right=delete(root.right, root.val);
        }
        return root;
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int l=1+count(root.left)+count(root.right);
        return l;
    }
    public static int minValue(Node root){
           int min=root.val;
           while(root.left!=null){
            min=root.left.val;
            root=root.left;
           }
           return min;
    }
    public static int findMaximum(Node root){
    
        if (root == null)
             return Integer.MIN_VALUE;
        // Return maximum of 3 values:
        // 1) Root's data
        // 2) Max in Left Subtree
        // 3) Max in right subtree
        int max = root.val;
        int lmax = findMaximum(root.left); //Maximum of left subtree
        int rmax = findMaximum(root.right); //Maximum of right subtree
        if (lmax > max)
        max = lmax;
        if (rmax > max)
        max = rmax;
        return max;
       }
       public  int height(Node root) {//Func for height of tree
        if (root == null) {
        return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
        }
        public static void leverorder(Node root){
            Queue<Node> k=new LinkedList<>();
            k.add(root);
            k.add(null);
            while(!k.isEmpty()){
                Node cur=k.remove();
                if(cur==null){
                    if(!k.isEmpty()){
                        k.add(null);
                        System.out.println("");

                    }
                }
                    else{
                        if(cur.left!=null){
                            k.add(cur.left);
                        }
                        if(cur.right!=null){
                            k.add(cur.right);
                        }
                        System.out.print(cur.val+" ");
                    }
                }
            }
        
        
    public static void main(String args[]){
        binarytree t=new binarytree();
        /* BST tree example
               45 
            /     \ 
           10      90 
          /  \    /   
         7   12  50   */
         //insert data into BST
         Node root=null;
        root=insert(root,-10);
        root=insert(root,-3);
        root=insert(root,0);
        root=insert(root,5);
        root=insert(root,9);
        root=insert(root,50);
        System.out.println("count of Nodes"+count(root));
        System.out.println("Preorder of the given binary tree");
        preoder(root);
        System.out.println();
        System.out.println("inorder of the binary tree");
        inorder(root);
        System.out.println();
        System.out.println("postorder of the binary tree");
        postorder(root);
        System.out.println("level order");
        leverorder(root);
        System.out.println(t.search(root,12));
        System.out.println(t.search(root, 7));
        root=delete(root,50);
        inorder(root);
        System.out.println("Node with largest element"+findMaximum(root));

        System.out.println("height"+t.height(root));
        System.out.println("count of Nodes"+count(root));
    }
    
}


