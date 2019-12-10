package com.data.trie;

public class MapSumTest {

    public static void main(String[] args) {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 1);
        mapSum.insert("ap", 2);
        mapSum.insert("batle", 3);

        System.out.println(mapSum.sum("ap"));
    }
}
