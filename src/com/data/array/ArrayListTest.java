package com.data.array;

/**
 * @author liupeng
 * @date 2019/8/26
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            list.addLast(i);
        }
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.removeElement(4);
        System.out.println(list);
    }
}
