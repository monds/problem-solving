package com.monds.ps.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _637 {
    static class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> list = new ArrayList<>();
            if (root == null) return list;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int count = queue.size();
                long sum = 0;
                for (int i = 0; i < count; i++) {
                    TreeNode node = queue.poll();
                    if (node != null) {
                        sum += node.val;
                        if (node.left != null) queue.add(node.left);
                        if (node.right != null) queue.add(node.right);
                    }
                }
                list.add(sum * 1.0 / count);
            }
            return list;
        }
    }
}
