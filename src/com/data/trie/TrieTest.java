package com.data.trie;

/**
 * @author liupeng
 * @date 2019/12/6
 */
public class TrieTest {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.add("hello");
        trie.add("word");
        trie.add("word");
        System.out.println(trie.getSize());
        System.out.println(trie.contains("w"));
        System.out.println(trie.contains("word"));
    }
}
