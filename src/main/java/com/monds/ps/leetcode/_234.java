package com.monds.ps.leetcode;

public class _234 {
    static class Solution {
        private ListNode ref;
        public boolean isPalindrome(ListNode head) {
            ref = head;
            return check(head);
        }

        private boolean check(ListNode node){
            if(node == null) return true;
            boolean ans = check(node.next);
            boolean isEqual = ref.val == node.val;
            ref = ref.next;
            return ans && isEqual;
        }
    }
}
