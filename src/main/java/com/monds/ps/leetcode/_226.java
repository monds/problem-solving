package com.monds.ps.leetcode;

public class _226 {
    static class Solution {
        public TreeNode invertTree(TreeNode root) {
            invertAdjacent(root);
            return root;
        }

        public TreeNode invertAdjacent(TreeNode node) {
            if (node == null) return null;
            TreeNode left = invertAdjacent(node.left);
            TreeNode right = invertAdjacent(node.right);
            node.left = right;
            node.right = left;
            return node;
        }
    }
}
