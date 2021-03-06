package com.data.segmentTree;

/**
 * @author liupeng
 * @date 2019/12/4
 */
public class SegmentTreeTest {

    public static void main(String[] args) {
        Integer[] nums = {8, 3, 6, 4, 1};
        SegmentTree<Integer> segmentTree = new SegmentTree<>(nums, (a, b) -> a + b);
        System.out.println(segmentTree);

        System.out.println(segmentTree.query(0, 2));

        segmentTree.set(0, 1);
        System.out.println(segmentTree.query(0, 2));
    }
}
