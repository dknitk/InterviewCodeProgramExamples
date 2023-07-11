package com.codinginterview;

public class KWQueueExample {

    public static void main(String[] args) {
        System.out.println("Queue Example....");
        Queue q1 = new Queue(5);
        q1.display();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.add(60);
        q1.add(70);
        q1.display();
        q1.deleteItem();
        q1.display();
        q1.deleteItem();
        q1.display();
        q1.deleteItem();
        q1.display();
        q1.deleteItem();
        q1.display();
        q1.deleteItem();
        q1.display();
        q1.deleteItem();
        q1.display();
    }
}

class Queue {
    int front = 0, rear = 0;
    int rearIndex = -1;
    boolean isFull, isEmpty;
    int[] queue;
    int size;
    Queue(int size){
        queue = new int[size];
        this.size = size;
    }
    boolean isFull(){
        if(queue.length == size){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(queue.length == 0){
            return true;
        }
        return false;
    }

    void add(int item){
        if(rearIndex != size - 1){
            queue[++rearIndex] = item;
            rear = item;
        }else{
            System.out.println("Queue is full, Insertion is not allowed for item..." + item);
        }
    }
    int deleteItem(){
        int temp = queue[0];
        if(rearIndex == -1){
            System.out.println("Queue is empty!");
        }else{
            for (int i = 0; i <= rearIndex - 1; i++){
                queue[i] = queue[i + 1];
            }
            rearIndex --;
        }

        return temp;
    }
    void display(){
        if(rearIndex == -1){
            System.out.println("Queue is Empty!!");
            return;
        }
        System.out.println("Queue Display!");
        for(int i = 0; i <= rearIndex; i++){
            System.out.print(queue[i] + " ");
        }
    }
}
