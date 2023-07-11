package com.codinginterview;

public class KWBinaryTreeExample {

    public static void main(String[] args) {
        System.out.println("Binary Tree Example!");
        TreeTraversal t1 = new TreeTraversal();
        t1.root = new Node('A');
        t1.root.left = new Node('B');
        t1.root.right = new Node('C');
        t1.root.left.left = new Node('D');
        t1.root.left.right = new Node('E');

        // Call method
        System.out.println("Pre Order Traversal");
        t1.prePorderTraversal(t1.root);
        System.out.println("\nIn Order Traversal");
        t1.inOrderTraversal(t1.root);
        System.out.println("\nPost Order Traversal");
        t1.postOrderTraversal(t1.root);

    }


}
class Node{
    char key;
    Node left;
    Node right;
    Node(char key){
        this.key = key;
    }
}

class TreeTraversal{
    Node root;

    void prePorderTraversal(Node n){
        if(n != null){
            System.out.print(n.key + " ");
            prePorderTraversal(n.left);
            prePorderTraversal(n.right);
        }
    }
    void postOrderTraversal(Node n){
        if(n != null){
            postOrderTraversal(n.left);
            postOrderTraversal(n.right);
            System.out.print(n.key + " ");
        }
    }
    void inOrderTraversal(Node n){
        if(n != null){
            inOrderTraversal(n.left);
            System.out.print(n.key + " ");
            inOrderTraversal(n.right);
        }
    }
}
