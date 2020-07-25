package com.monds.ps.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _160 {
    static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) return null;
            Set<ListNode> set = new HashSet<>();
            while (headA != null) {
                set.add(headA);
                headA = headA.next;
            }
            while (headB != null) {
                if (set.contains(headB)) return headB;
                headB = headB.next;
            }
            return null;
        }
    }
}
