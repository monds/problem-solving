package com.monds.ps.leetcode;

public class _104 {
    static class Solution {
        public int maxDepth(TreeNode root) {
            return findMaxDepth(root, 0, 0);
        }

        private int findMaxDepth(TreeNode node, int curr, int max) {
            if (node == null) return max;
            curr++;
            if (curr > max) max = curr;
            max = findMaxDepth(node.left, curr, max);
            max = findMaxDepth(node.right, curr, max);
            return max;
        }
    }
}
