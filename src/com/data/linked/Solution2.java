package com.data.linked;

/**
 * 使用虚拟头结点
 */
public class Solution2 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prevNode = dummyHead;
        while (prevNode.next != null) {
            if (prevNode.next.val == val) {
                ListNode delNode = prevNode.next;
                prevNode.next = delNode.next;
                delNode.next = null;
            } else {
                prevNode = prevNode.next;
            }
        }
        return dummyHead.next;
    }
}
