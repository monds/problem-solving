package com.monds.ps.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _107 {
    static class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> orders = new ArrayList<>();
            addNodes(orders, root, 0);
            Collections.reverse(orders);
            return orders;
        }

        private void addNodes(List<List<Integer>> orders, TreeNode node, int level) {
            if (node == null) return;
            List<Integer> order;
            if (orders.size() < level + 1) {
                order = new ArrayList<>();
                orders.add(order);
            } else {
                order = orders.get(level);
            }
            order.add(node.val);

            addNodes(orders, node.left, level + 1);
            addNodes(orders, node.right, level + 1);
        }
    }
}
