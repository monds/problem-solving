package com.monds.ps.leetcode;

import java.util.*;

public class _872 {
    static class Solution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            if (root1 == null || root2 == null) return false;
            int[] leaf1 = getLeaf(root1);
            int[] leaf2 = getLeaf(root2);
            if (leaf1.length != leaf2.length) return false;
            return Arrays.equals(leaf1, leaf2);
        }

        private int[] getLeaf(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                if (node.left != null) stack.add(node.left);
                if (node.right != null) stack.add(node.right);
                if (node.left == null && node.right == null) {
                    list.add(node.val);
                }
            }
            return list.stream().mapToInt(i -> i).toArray();
        }
    }
}
