package com.monds.ps.leetcode;

public class _101 {
    static class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return isMirror(root.left, root.right);
        }

        private boolean isMirror(TreeNode n1, TreeNode n2) {
            if (n1 == null && n2 == null) return true;
            if (n1 == null || n2 == null) return false;
            return (n1.val == n2.val)
                && isMirror(n1.left, n2.right)
                && isMirror(n1.right, n2.left);
        }
    }
}
