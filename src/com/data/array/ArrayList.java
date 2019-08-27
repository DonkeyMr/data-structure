package com.data.array;

/**
 * @author liupeng
 * @date 2019/8/26
 */
public class ArrayList {

    private int[] data;

    private int size;

    /**
     * 有参构造，传入集合的容量capacity构造List
     */
    public ArrayList(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
    }

    /**
     * 无参构造，默认容量capacity = 10
     */
    public ArrayList() {
        this(10);
    }

    /**
     * 获取数组的容量
     */
    public int getCapacity() {
       return data.length;
    }

    /**
     * 获取元素个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 集合是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }
}
