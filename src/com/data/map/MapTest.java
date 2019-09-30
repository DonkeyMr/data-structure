package com.data.map;

import com.data.set.FileOperation;

import java.util.ArrayList;

/**
 * @author liupeng
 * @date 2019/9/30
 */
public class MapTest {

    public static void main(String[] args) {
        linkedListMapTest();
    }

    private static void linkedListMapTest() {
        System.out.println("pride-and-prejudice");
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile("pride-and-prejudice.txt", words)) {
            System.out.println(words.size());

            Map<String, Integer> map = new BSTMap<>();
            words.forEach(word -> {
                if (map.contains(word)) {
                    map.set(word, map.get(word) + 1);
                } else {
                    map.add(word, 1);
                }
            });
            System.out.println(map.getSize());
            System.out.println("pride：" + map.get("pride"));
            System.out.println("prejudice：" + map.get("prejudice"));
        }
    }
}
