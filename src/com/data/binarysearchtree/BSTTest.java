package com.data.binarysearchtree;

/**
 * @author liupeng
 * @date 2019/9/27
 */
public class BSTTest {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] arr = {5, 3, 6, 8, 4, 2};
        for (int i : arr) {
            bst.add(i);
        }

        bst.preOrder();
    }
}
