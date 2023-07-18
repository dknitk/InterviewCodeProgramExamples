package com.codinginterview;

import java.util.LinkedList;

public class ReverseLinkedListExample {
    public static void main(String[] args) {
        System.out.println("Reverse a Linked List Example");
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println(ll);

        LinkedList<Integer> ll1 = new LinkedList<>();
        ll.descendingIterator().forEachRemaining(ll1::add);
        System.out.println(ll1);
    }
}
