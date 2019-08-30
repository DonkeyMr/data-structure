package com.data.queue;

/**
 * @author liupeng
 * @date 2019/8/30
 */
public interface Queue<E> {

    void enqueue(E e);

    E dequeue();

    E getFront();

    int getSize();

    boolean isEmpty();
}
