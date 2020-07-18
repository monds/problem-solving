package com.monds.ps.leetcode;

public class _437 {
    static class Solution {
        public int pathSum(TreeNode root, int sum) {
            return countPathSum(root, sum);
        }

        private int countPathSum(TreeNode node, int sum) {
            if (node == null) return 0;
            int countFromRoot = countPathSumFromNode(node, sum, 0);
            int countFromLeft = countPathSum(node.left, sum);
            int countFromRight = countPathSum(node.right, sum);
            return countFromRoot + countFromLeft + countFromRight;
        }

        private int countPathSumFromNode(TreeNode node, int sum, int curr) {
            if (node == null) return 0;
            curr += node.val;
            int count = 0;
            if (sum == curr) count++;
            count += countPathSumFromNode(node.left, sum, curr);
            count += countPathSumFromNode(node.right, sum, curr);
            return count;
        }
    }
}
