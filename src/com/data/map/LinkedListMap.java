package com.data.map;

/**
 * @author liupeng
 * @date 2019/9/30
 */
public class LinkedListMap<K, V> implements Map<K, V> {

    private class Node {
        public K key;

        public V value;

        public Node next;

        public Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node(K key) {
            this(key, null, null);
        }

        public Node() {

        }

        @Override
        public String toString() {
            return key.toString() + "：" + value.toString();
        }
    }

    private Node dummyHead;

    private int size;

     public LinkedListMap() {
         dummyHead = new Node();
         size = 0;
     }


    @Override
    public void add(K key, V value) {
        Node node = getNode(key);
        if (node == null) {
            dummyHead.next = new Node(key, value, dummyHead.next);
            size++;
        } else {
            node.value = value;
        }
    }

    @Override
    public V remove(K key) {
        Node prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.key.equals(key)) {
                break;
            }
            prev = prev.next;
        }

        if (prev.next != null) {
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size--;
            return delNode.value;
        }
        return null;
    }

    @Override
    public void set(K key, V value) {
        Node node = getNode(key);
        if (node == null) {
            throw new IllegalArgumentException(key + "doesn't existed");
        }
        node.value = value;
    }

    @Override
    public V get(K key) {
        Node node = getNode(key);
        return node == null ? null : node.value;
    }

    @Override
    public boolean contains(K key) {
        return getNode(key) != null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private Node getNode(K key) {
         Node cur = dummyHead;
        while (cur.next != null) {
            if (cur.next.key.equals(key)) {
                return cur.next;
            }
            cur = cur.next;
        }
        return null;
    }
}
