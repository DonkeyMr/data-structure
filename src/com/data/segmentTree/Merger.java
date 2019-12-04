package com.data.segmentTree;

/**
 * @author liupeng
 * @date 2019/12/4
 */
@FunctionalInterface
public interface Merger<E> {

    E merge(E a, E b);
}
