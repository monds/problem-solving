package com.monds.ps.leetcode;

/**
 * Created by monds on 2020-08-12
 */
public class _938 {
    static class Solution {
        private int sum;
        public int rangeSumBST(TreeNode root, int L, int R) {
            if (root == null) return 0;
            if (root.val >= L && root.val <= R) sum += root.val;
            rangeSumBST(root.left, L, R);
            rangeSumBST(root.right, L, R);
            return sum;
        }
    }
}
