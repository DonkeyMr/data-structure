package com.data.binarysearchtree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author liupeng
 * @date 2019/9/27
 */
public class BSTTest {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            bst.add(random.nextInt(10000));
        }
        System.out.println(bst.getSize());

        List<Integer> nums = new ArrayList<>(bst.getSize());
        while (!bst.isEmpty()) {
            nums.add(bst.removeMin());
        }
        System.out.println(bst.getSize());
        System.out.println(nums);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                throw new IllegalArgumentException("--- fail ---");
            }
        }
        System.out.println("removeMin is completed");

    }
}
