package com.monds.ps.leetcode;

import java.util.Stack;

public class _112 {
    static class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {
            Stack<TreeNode> stack = new Stack<>();
            Stack<Integer> sums = new Stack<>();
            stack.push(root);
            sums.push(sum);

            while (root != null && !stack.isEmpty()) {
                TreeNode node = stack.pop();
                int val = sums.pop();

                TreeNode left = node.left;
                TreeNode right = node.right;

                if (node.val == val && left == null && right == null) return true;

                if (left != null) {
                    stack.push(left);
                    sums.push(val - node.val);
                }

                if (right != null) {
                    stack.push(right);
                    sums.push(val - node.val);
                }
            }

            return false;
        }

    }
}
