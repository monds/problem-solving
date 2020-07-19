package com.monds.ps.leetcode;

public class _543 {
    static class Solution {
        int res = 1;

        public int diameterOfBinaryTree(TreeNode root) {
            max(root);
            return res - 1;
        }

        /**
         * 특정 노드를 시작으로 하는 최대 깊이
         * @param node 시작 노드
         * @return 깊이
         */
        private int max(TreeNode node) {
            if (node == null) return 0;
            int maxL = max(node.left);
            int maxR = max(node.right);
            // 특정 노드 기준의 최대 깊이를 구할 때마다 깊이가 깊어지면 res에 최대 깊이를 업데이트한다.
            res = Math.max(maxL + maxR + 1, res);
            return Math.max(maxL, maxR) + 1;
        }
    }
}
