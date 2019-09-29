package com.data.set;

import com.data.binarysearchtree.BST;

/**
 * @author liupeng
 * @date 2019/9/29
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {

    private BST<E> bst;

    public BSTSet() {
        bst = new BST<>();
    }

    @Override
    public int getSize() {
        return this.bst.getSize();
    }

    @Override
    public boolean isEmpty() {
        return this.bst.isEmpty();
    }

    @Override
    public boolean contains(E e) {
        return this.bst.contains(e);
    }

    @Override
    public void add(E e) {
        this.bst.add(e);
    }

    @Override
    public void remove(E e) {
        this.bst.remove(e);
    }
}
