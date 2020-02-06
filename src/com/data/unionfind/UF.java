package com.data.unionfind;

/**
 * @author liupeng
 * @date 2020/2/6 15:24
 */
public interface UF {

    int getSize();
    boolean isConnected(int p, int q);
    void union(int p, int q);
}
