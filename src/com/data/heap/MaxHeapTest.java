package com.data.heap;

import java.util.Random;

public class MaxHeapTest {

    public static void main(String[] args) {
        int n = 10000000;

        Random random = new Random();
        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = random.nextInt(Integer.MAX_VALUE);
        }

        heapifyTest(nums, false);
        heapifyTest(nums, true);
    }

    private static void heapifyTest(Integer[] arr, boolean isHeapify) {
        long startTime = System.nanoTime();

        MaxHeap<Integer> maxHeap;
        if (isHeapify) {
            maxHeap = new MaxHeap<>(arr);
        } else {
            maxHeap = new MaxHeap<>(arr.length);
            for (Integer integer : arr) {
                maxHeap.add(integer);
            }
        }

        int[] sortArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortArr[i] = maxHeap.extractMax();
        }

        for (int i = 1; i < sortArr.length; i++) {
            if (sortArr[i - 1] < sortArr[i]) {
                throw new IllegalArgumentException("maxHeap is Fail");
            }
        }

        long endTime = System.nanoTime();

        System.out.println("heapify，" + isHeapify + "：" + (endTime - startTime) / 1000000000.0);
    }

    private static void maxHeapTest() {
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
