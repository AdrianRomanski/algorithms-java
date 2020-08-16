package days30_of_code;

public class BinarySearchTree {

    public static int getHeight(Node root){
       if(root == null) {
           return -1;
       }
       int left = getHeight(root.left);
       int right = getHeight(root.right);

       if(left > right) {
           return left+1;
       } else {
           return  right+1;
       }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
}

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
