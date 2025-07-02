import java.util.*;
public class tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left); 
        postorder(root.right);
        System.out.println(root.data+" ");
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q1=new LinkedList<>() ;
        q1.add(root);
        q1.add(null);
        while(!q1.isEmpty()){
            Node currNode=q1.remove();
            if(currNode==null){
                System.out.println();
                if(q1.isEmpty()){
                    break;
                }else{
                    q1.add(null);
                }
            }
            else{
                System.out.print(currNode.data+"");
                if(currNode.left!=null){
                    q1.add(currNode.left);
                }
                if(currNode.right!=null){
                    q1.add(currNode.right);
                }
            }
        }

    }
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.idx = -1;
        Node root = BinaryTree.buildTree(nodes);  
        tree.levelOrder(root);
    }
}
