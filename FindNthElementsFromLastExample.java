package com.codinginterview;

public class FindNthElementsFromLastExample {
    public static void main(String[] args) {
        System.out.println("Find nth Elements from last");
        NodeF nodeF = new NodeF(1);
        nodeF.next = new NodeF(2);
        nodeF.next.next = new NodeF(3);
        nodeF.next.next.next = new NodeF(4);
        nodeF.next.next.next.next = new NodeF(5);

        NodeF result = findnthElementFromLast(nodeF, 6);
        if(result != null){
            System.out.println(result.value);
        }else{
            System.out.println("Wrong item to find!!");
        }
    }
    private static NodeF findnthElementFromLast(NodeF root, int n){
        NodeF curr = root;
        NodeF follower = root;
        for(int i = 0; i< n-1; i++){
            if(curr == null ) return null;
            curr = curr.next;
        }
        if(curr == null) return null;
        while(curr.next != null){
            curr = curr.next;
            follower = follower.next;
        }
        return follower;
    }
}


class NodeF{
    int value;
    NodeF next;
    NodeF(int value){
        this.value = value;
    }
}