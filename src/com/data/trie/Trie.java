package com.data.trie;

import java.util.TreeMap;

/**
 * @author liupeng
 * @date 2019/12/6
 */
public class Trie {

    private class Node {
        public Boolean isWord;
        public TreeMap<Character, Node> next;

        public Node(Boolean isWord) {
            this.isWord = isWord;
            next = new TreeMap<>();
        }

        public Node() {
            this(false);
        }
    }

    private Node root;

    private int size;

    public Trie() {
        root = new Node();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!cur.next.containsKey(c)) {
                cur.next.put(c, new Node());
            }
            cur = cur.next.get(c);
        }

        if (!cur.isWord) {
            cur.isWord = true;
            size++;
        }
    }
 }