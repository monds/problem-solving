package com.monds.ps.leetcode;

public class _21 {
    static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;
            ListNode list = new ListNode();
            ListNode curr = list;
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    curr.next = l1;
                    l1 = l1.next;
                } else {
                    curr.next = l2;
                    l2 = l2.next;
                }
                curr = curr.next;
            }
            curr.next = (l1 == null) ? l2 : l1;
            return list.next;
        }
    }
}
