package com.data.map;

/**
 * @author liupeng
 * @date 2019/9/30
 */
public interface Map<K, V> {

    void add(K key, V value);

    V remove(K key);

    void set(K key, V value);

    V get(K key);

    boolean contains(K key);

    int getSize();

    boolean isEmpty();
}
