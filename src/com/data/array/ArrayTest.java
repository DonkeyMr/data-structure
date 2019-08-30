package com.data.array;

/**
 * @author liupeng
 * @date 2019/8/26
 */
public class ArrayTest {

    public static void main(String[] args) {
        Array<Integer> arr = new Array<>(5);
        for (int i = 0; i < 5; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.addLast(5);
        System.out.println(arr);
    }
}
