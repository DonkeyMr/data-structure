package com.data.linked;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

import sun.applet.Main;

/**
 * 不使用虚拟头结点
 */
class Solution {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        // 从head开始删除，把链表元素全部删除了
        if (head == null) {
            return null;
        }

        // 删除中间元素
        ListNode prevNode = head;
        while (prevNode.next != null) {
            if (prevNode.next.val == val) {
                ListNode delNode = prevNode.next;
                prevNode.next = delNode.next;
                delNode.next = null;
            } else {
                prevNode = prevNode.next;
            }
        }

        return head;
    }
}