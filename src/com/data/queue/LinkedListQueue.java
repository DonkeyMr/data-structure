package com.data.queue;

import com.data.linked.LinkedList;

public class LinkedListQueue<E> implements  Queue<E> {

    private class Node {
        public E e;

        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head, tail;

    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(E e) {
        if (isEmpty()) {
            tail = new Node(e);
            head = tail;
            size++;
            return;
        }

        tail.next = new Node(e);
        tail = tail.next;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }

        Node retNode = head;
        head = head.next;
        retNode.next = null;
        if (head == null) {
            tail = null;
        }
        size--;

        return retNode.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }

        return head.e;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Queue：front ");
        Node curNode = head;
        while (curNode != null) {
            builder.append(curNode.e).append("->");
            curNode = curNode.next;
        }
        builder.append("null tail");
        return builder.toString();
    }
}
