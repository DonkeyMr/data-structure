package com.data.queue;

import jdk.nashorn.internal.ir.ForNode;
import org.omg.CORBA.DATA_CONVERSION;

import java.util.Arrays;

public class LoopQueue<E> implements Queue<E> {

    private Object[] data;

    private int front, tail;

    private int size;

    public LoopQueue(int capacity) {
        this.data = new Object[capacity + 1];
        this.front = 0;
        this.tail = 0;
        this.size = 0;
    }

    public LoopQueue() {
        this(10);
    }


    public int getCapacity() {
        return data.length - 1;
    }

    @Override
    public void enqueue(E e) {
        if ((tail + 1) % data.length == front) {
            resize(getCapacity() * 2);
        }

        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空");
        }

        E temp = (E) data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }

        return temp;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空");
        }
        return (E) data[front];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    private void resize(int capacity) {
        Object[] newData = new Object[capacity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(i + front) % data.length];
        }

        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("LoopQueue，size = %d，capacity = %d\n", size, getCapacity()));
        builder.append("front [");
        for (int i = 0; i < size; i++) {
            builder.append(data[(i + front) % data.length]);
            if (i != size - 1) {
                builder.append(",");
            }
        }
        builder.append("] tail");
        return builder.toString();
    }
}
