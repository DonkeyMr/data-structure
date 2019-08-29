package com.data.array;

import java.util.Arrays;

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

    /**
     * 向所有元素后添加一个新元素
     */
    public void addLast(int e) {
        add(size, e);
    }

    /**
     * 向所有元素之前添加一个新元素
     */
    public void addFirst(int e) {
        add(0, e);
    }

    /**
     * 向指定 index 插入一个元素
     */
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("添加失败，集合已满");
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("添加失败，index > 0 && index <= size");
        }

        for (int i = size - 1; i >= index ; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 获取指定位置的元素
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引越界");
        }
        return data[index];
    }

    /**
     * 修改指定位置的元素
     */
    public void set(int index, int e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引越界");
        }
        data[index] = e;
    }

    /**
     * 查看集合中是否含有元素E
     */
    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查看元素在集合中的位置
     * 若元素不存在，则返回 -1
     */
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 删除指定位置的元素
     */
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引越界");
        }

        int temp = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = 0;

        return temp;
    }

    /**
     * 删除指定元素E
     */
    public void removeElement(int e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        return "length：" + data.length + "，size：" + size + "\n" +
            Arrays.toString(data);
    }
}
