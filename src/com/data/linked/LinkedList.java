package com.data.linked;

public class LinkedList<E> {

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


    private Node head;

    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * 获取链表中元素个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 链表是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 链表头添加元素
     */
    public void addFirst(E e) {
       // Node node = new Node(e);
       // node.next = head;
       // head = node;
        head = new Node(e, head);
        size++;
    }

    /**
     * 链表中插入一个元素
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("illegal index");
        }

        if (index == 0) {
            addFirst(e);
            return;
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
       // Node node = new Node(e);
       // node.next = prev.next;
       // prev.next = node;
        prev.next = new Node(e, prev.next);
        size++;
    }

    /**
     * 链表末尾添加一个元素
     */
    public void addLast(E e) {
        add(size, e);
    }
}