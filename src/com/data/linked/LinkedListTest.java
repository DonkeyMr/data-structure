package com.data.linked;

import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.addFirst(i);
            System.out.println(list);
        }

        list.set(2, 666);
        System.out.println(list);
    }
}
