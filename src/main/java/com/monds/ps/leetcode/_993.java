package com.monds.ps.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by suahn on 2020-07-27
 */
public class _993 {
    static class Solution {
        private static class NodeInfo {
            TreeNode parents;
            int depth;

            public NodeInfo(TreeNode parents, int depth) {
                this.parents = parents;
                this.depth = depth;
            }
        }

        public boolean isCousins(TreeNode root, int x, int y) {
            if (root.val == x || root.val == y) return false;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            NodeInfo xNode = null, yNode = null;
            int depth = 0;
            outer:
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    if (node != null) {
                        if (node.left != null) {
                            if (node.left.val == x) xNode = new NodeInfo(node, depth);
                            if (node.left.val == y) yNode = new NodeInfo(node, depth);
                            queue.add(node.left);
                        }
                        if (node.right != null) {
                            if (node.right.val == x) xNode = new NodeInfo(node, depth);
                            if (node.right.val == y) yNode = new NodeInfo(node, depth);
                            queue.add(node.right);
                        }
                        if (xNode != null && yNode != null) break outer;
                    }
                }
                depth++;
            }

            return xNode.parents != yNode.parents && xNode.depth == yNode.depth;
        }
    }
}
