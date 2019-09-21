package com.data.linked;

/**
 * 使用递归
 */
public class Solution3 {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }

    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 6, 4, 5, 6};
        int[] arr = {1, 4, 5, 6};
        ListNode listNode = new ListNode(arr);
        System.out.println(listNode);

        Solution3 solution = new Solution3();
        ListNode finalNodel = solution.removeElements(listNode, 6);
        System.out.println(finalNodel);
    }
}
