package com.data.set;

import java.util.ArrayList;

/**
 * @author liupeng
 * @date 2019/9/29
 */
public class SetTest {

    public static void main(String[] args) {
        BSTSetTest();
        LinkedListSetTest();
    }

    private static void BSTSetTest() {
        System.out.println("pride-and-prejudice");

        ArrayList<String> words = new ArrayList<>(150000);
        if (FileOperation.readFile("pride-and-prejudice.txt", words)) {
            System.out.println(words.size());

            BSTSet<String> bstSet = new BSTSet<>();
            words.forEach(bstSet::add);
            System.out.println(bstSet.getSize());
        }

        System.out.println("a-tale-of-two-cities");
        ArrayList<String> words2 = new ArrayList<>(150000);
        if (FileOperation.readFile("a-tale-of-two-cities.txt", words2)) {
            System.out.println(words2.size());

            BSTSet<String> bstSet = new BSTSet<>();
            words2.forEach(bstSet::add);
            System.out.println(bstSet.getSize());
        }
    }

    private static void LinkedListSetTest() {
        System.out.println("pride-and-prejudice");

        ArrayList<String> words = new ArrayList<>(150000);
        if (FileOperation.readFile("pride-and-prejudice.txt", words)) {
            System.out.println(words.size());

            LinkedListSet<String> linkedListSet = new LinkedListSet<>();
            words.forEach(linkedListSet::add);
            System.out.println(linkedListSet.getSize());
        }

        System.out.println("a-tale-of-two-cities");
        ArrayList<String> words2 = new ArrayList<>(150000);
        if (FileOperation.readFile("a-tale-of-two-cities.txt", words2)) {
            System.out.println(words2.size());

            LinkedListSet<String> linkedListSet = new LinkedListSet<>();
            words2.forEach(linkedListSet::add);
            System.out.println(linkedListSet.getSize());
        }
    }
}
