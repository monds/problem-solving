package com.monds.ps.leetcode;

public class _108 {
    static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums.length == 0) return null;
            int mid = nums.length / 2;
            TreeNode root = new TreeNode(nums[mid]);
            bst(root, nums, true, 0, mid - 1);
            bst(root, nums, false, mid + 1, nums.length - 1);
            return root;
        }

        private void bst(TreeNode parent, int[] nums, boolean isLeft, int start, int end) {
            if (start <= end) {
                int mid = (start + end) / 2;
                TreeNode node = new TreeNode(nums[mid]);
                if (isLeft) {
                    parent.left = node;
                } else {
                    parent.right = node;
                }
                bst(node, nums, true, start, mid - 1);
                bst(node, nums, false, mid + 1, end);
            }
        }
    }
}
