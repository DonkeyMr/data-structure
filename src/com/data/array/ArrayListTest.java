package com.data.array;

/**
 * @author liupeng
 * @date 2019/8/26
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList list = new ArrayList(5);
        list.addLast(1);
        list.addLast(3);
        list.addLast(4);
        list.add(1, 2);
    }
}
