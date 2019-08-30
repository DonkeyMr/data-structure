package com.data.stack;

import com.data.array.Array;

/**
 * @author liupeng
 * @date 2019/8/30
 */
public class ArrayStack<E> implements Stack<E> {

    private Array<E> array;

    public ArrayStack(int capacity) {
        this.array = new Array<>(capacity);
    }

    public ArrayStack() {
        this.array = new Array<>();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /**
     * 查看容量
     */
    private int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        return array.toString();
    }
}
