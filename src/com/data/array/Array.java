package com.data.array;

import java.util.Arrays;

/**
 * @author liupeng
 * @date 2019/8/26
 */
public class Array<E> {

    private Object[] data;

    private int size;

    /**
     * 有参构造，传入集合的容量capacity构造List
     */
    public Array(int capacity) {
        this.data = new Object[capacity];
        this.size = 0;
    }

    /**
     * 无参构造，默认容量capacity = 10
     */
    public Array() {
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
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 向所有元素之前添加一个新元素
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 向指定 index 插入一个元素
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("添加失败，index > 0 && index <= size");
        }

        if (size == data.length) {
            int newCapacity = data.length * 2;
            resize(newCapacity);
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
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引越界");
        }
        return (E) data[index];
    }

    /**
     * 查看最后一个元素
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * 查看第一个元素
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 修改指定位置的元素
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引越界");
        }
        data[index] = e;
    }

    /**
     * 查看集合中是否含有元素E
     */
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查看元素在集合中的位置
     * 若元素不存在，则返回 -1
     */
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 删除指定位置的元素
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引越界");
        }

        E temp = (E) data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;

        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }

        return temp;
    }

    /**
     * 删除第一个元素
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 删除最后一个元素
     */
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * 删除指定元素E
     */
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    private void resize(int newCapacity) {
        Object[] newData = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString() {
        return "length：" + data.length + "，size：" + size + "\n" +
            Arrays.toString(data);
    }

    /**
     * 交换两个位置的元素
     */
    public void swap(int i, int j) {
        if (i < 0 || i >= size || j < 0 || j >= size) {
            throw new IllegalArgumentException("index is illegal");
        }

        E temp = (E) data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
