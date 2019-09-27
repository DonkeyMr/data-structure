package com.data.binarysearchtree;

/**
 * @author liupeng
 * @date 2019/9/27
 */
public class BSTTest {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] arr = {36, 27, 45, 18, 30, 46};
        for (int i : arr) {
            bst.add(i);
        }

        bst.preOrder();
        System.out.println();
        bst.preOrderNR();
    }
}
