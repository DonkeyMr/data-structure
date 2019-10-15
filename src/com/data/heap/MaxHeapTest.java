package com.data.heap;

import java.util.Random;


public class MaxHeapTest {
    public static void main(String[] args) {
        int n = 100000;

        MaxHeap<Integer> maxHeap = new MaxHeap<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            maxHeap.add(random.nextInt(Integer.MAX_VALUE));
        }

        int[] sortArr = new int[n];
        for (int i = 0; i < n; i++) {
            sortArr[i] = maxHeap.extractMax();
        }

        for (int i = 1; i < n; i++) {
            if (sortArr[i - 1] < sortArr[i]) {
                throw new IllegalArgumentException("maxHeap is Fail");
            }
        }

        System.out.println("maxHeap is success");
    }
}
