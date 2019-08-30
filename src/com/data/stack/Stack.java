package com.data.stack;

/**
 * @author liupeng
 * @date 2019/8/30
 */
public interface Stack<E> {

    /**
     * 入栈
     */
    void push(E e);

    /**
     * 出栈
     */
    E pop();

    /**
     * 查看栈顶的元素
     */
    E peek();

    /**
     * 元素个数
     */
    int getSize();

    /**
     * 是否没有元素
     */
    boolean isEmpty();
}
