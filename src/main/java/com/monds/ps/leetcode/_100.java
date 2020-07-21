package com.monds.ps.leetcode;

public class _100 {
    static class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            return isSame(p, q);
        }

        private boolean isSame(TreeNode n1, TreeNode n2) {
            if (n1 == null && n2 == null) return true;
            if (n1 == null || n2 == null) return false;
            return (n1.val == n2.val)
                && isSame(n1.left, n2.left)
                && isSame(n2.right, n2.right);
        }
    }
}
