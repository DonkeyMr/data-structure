package com.data.set;

/**
 * @author liupeng
 * @date 2019/9/29
 */
public interface Set<E> {

    int getSize();

    boolean isEmpty();

    boolean contains(E e);

    void add(E e);

    void remove(E e);
}
