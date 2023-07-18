package com.codinginterview;

public class KWCircularLLExample {
    NodeL head, tail;

    public static void main(String[] args) {
        KWCircularLLExample circularLLExample = new KWCircularLLExample();
        System.out.println("Circular Linked List Example!");
        circularLLExample.displayElements();
        circularLLExample.insertElements(10);
        circularLLExample.insertElements(20);
        System.out.println("******* Display again *******");
        circularLLExample.displayElements();
        circularLLExample.deleteElements();
        System.out.println("******* Display again *******");
        circularLLExample.displayElements();
        circularLLExample.insertElements(30);
        circularLLExample.insertElements(40);
        circularLLExample.insertElements(50);
        circularLLExample.deleteElements();
        System.out.println("******* Display again *******");
        circularLLExample.displayElements();
    }

    void insertElements(int data) {
        NodeL nodeL = new NodeL(data);
        if (head == null && tail == null) {
            head = nodeL;
            tail = nodeL;
            tail.next = nodeL;
        }else{
            tail.next = nodeL;
            tail = nodeL;
            tail.next = head;
        }
    }
    // Delete head Node
    void deleteElements(){
        if(head == null){
            System.out.println("There is nothing to delete!");
        }else{
            NodeL temp = head;
            head = head.next;
            tail.next = head;
            System.out.println(temp.data + " Delete from the List!");
            temp = null;
        }
    }

    void displayElements() {
        NodeL temp = head;
        if (head == null) {
            System.out.println("There is nothing to display!!");
        } else {
            do {
                System.out.println(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

}

class NodeL {
    int data;
    NodeL next;

    NodeL(int data) {
        this.data = data;
    }
}
