package com.monds.ps.leetcode;

public class _206 {
    static class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            // 마지막까지 돌면서 next가 null일 때까지 찾는다.
            // next가 null일 경우 그 해당 node를 돌려준다.
            ListNode p = reverseList(head.next);
            head.next.next = head;
            // 이 부분이 있어야 가장 마지막 노드의 next를 null처리하고
            // 순환 되지 않도록 할 수 있다.
            head.next = null;
            return p;
        }
    }
}
