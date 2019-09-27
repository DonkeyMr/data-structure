package com.data.binarysearchtree;

/**
 * @author liupeng
 * @date 2019/9/26
 */
public class BST<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node left;
        public Node right;

        public Node(E e) {
            this.e = e;
        }
    }

    private Node root;
    private int size;

    public BST() {
        this.root = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向二分搜索树中添加元素
     */
    public void add(E e) {
        root = add(root, e);
    }

    /**
     * 返回插入新节点后的二分搜索树的根
     */
    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0){
            node.right = add(node.right, e);
        }
        return node;
    }

    /**
     * 查看二分搜索树是否包含某元素
     */
    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node curNode, E e) {
        if (curNode == null) {
            return false;
        }

        if (e.equals(curNode.e)) {
            return true;
        } else if (e.compareTo(curNode.e) < 0) {
            return contains(curNode.left, e);
        } else {
            return contains(curNode.right, e);
        }
    }

    /**
     * 前序遍历
     */
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        generateBSTString(root, 0, builder);
        return builder.toString();
    }

    private void generateBSTString(Node node, int depth, StringBuilder builder) {
        if (node == null) {
            builder.append(generateDepthString(depth) + "null\n");
            return;
        }

        builder.append(generateDepthString(depth)).append(node.e).append("\n");
        generateBSTString(node.left, depth + 1, builder);
        generateBSTString(node.right, depth + 1, builder);
    }

    private String generateDepthString(int depth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append("--");
        }
        return builder.toString();
    }


}
