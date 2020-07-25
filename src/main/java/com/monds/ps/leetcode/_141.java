package com.monds.ps.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _141 {
    static class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null) return false;
            Set<ListNode> set = new HashSet<>();
            ListNode curr = head;
            while (!set.contains(curr)) {
                set.add(curr);
                curr = curr.next;
                if (curr == null) return false;
            }
            return true;
        }
    }
}
