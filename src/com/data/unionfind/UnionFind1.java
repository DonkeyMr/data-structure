package com.data.unionfind;

/**
 * Quick Find
 * @author liupeng
 * @date 2020/2/6 15:25
 */
public class UnionFind1 implements UF {

    private int[] id;

    public UnionFind1(int size) {
        this.id = new int[size];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    @Override
    public int getSize() {
        return id.length;
    }

    private int find(int p) {
        if (p < 0 || p >= id.length) {
            throw new IllegalArgumentException("index is illegal");
        }
        return id[p];
    }

    /**
     * 元素P和元素Q是否属于同一集合
     * O(1)
     */
    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    /**
     * 合并元素P和元素Q所属的集合
     * O(n)
     */
    @Override
    public void union(int p, int q) {
        int pid = find(p);
        int qid = find(q);

        if (pid == qid) {
            return;
        }
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
