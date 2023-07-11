package com.codinginterview;

public class KWBinarySearchTreeExample {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree Example!");
        BinaryTreeSolution binaryTreeSolution = new BinaryTreeSolution();
        binaryTreeSolution.insertKey('C');
        binaryTreeSolution.insertKey('I');
        binaryTreeSolution.insertKey('B');
        binaryTreeSolution.insertKey('G');
        binaryTreeSolution.insertKey('M');
        binaryTreeSolution.insertKey('A');

        binaryTreeSolution.preOrderTraversal(binaryTreeSolution.root);

    }
}

class BinaryTreeSolution{

    NodeB root;
    void insertKey(char key){
        root = insertInTree(root, key);
    }
    NodeB insertInTree(NodeB root, char key){
        if(root == null){
            root = new NodeB(key);
            return root;
        }
        if(key < root.key){
            root.left = insertInTree(root.left, key);
        }else if( key > root.key){
            root.right = insertInTree(root.right, key);
        }
        return root;
    }
    void preOrderTraversal(NodeB root){
        if(root != null){
            System.out.print(root.key + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
}

class NodeB {
    char key;
    NodeB left, right;
    NodeB(char key){
        this.key = key;
    }
}
