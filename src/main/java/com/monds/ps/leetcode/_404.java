package com.monds.ps.leetcode;

public class _404 {
    static class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            return addIfLeft(root, false);
        }

        private int addIfLeft(TreeNode node, boolean isLeft) {
            if (node == null) return 0;
            if (node.left == null && node.right == null && isLeft) return node.val;
            return addIfLeft(node.left, true) + addIfLeft(node.right, false);
        }
    }
}
