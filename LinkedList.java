package com.codinginterview.dsa;

public class LinkedList<T extends Comparable<T>> implements Cloneable {

    private Node<T> head = null;
    public LinkedList(){

    }

    public int countNodes(){
        if(head == null){
            return 0;
        }else{
            Node<T> curr = head;
            int count = 0;
            while(curr != null){
                curr = curr.getNext();
                count++;
            }
            return count;
        }
    }

    public void addNode(T data){
        if (head == null){
            head = new Node<T>(data);
        }else{
            Node<T> curr = head;
            while(curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(new Node<T>(data));
        }
    }

    public T popElement(){
        if(head != null){
            T topElement = head.getData();
            head = head.getNext();

            return topElement;
        }
        return null;
    }
}
