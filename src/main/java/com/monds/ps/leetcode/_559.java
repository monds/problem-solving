package com.monds.ps.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by suahn on 2020-07-27
 */
public class _559 {
    static class Solution {
        public int maxDepth(Node root) {
            if (root == null) return 0;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            int depth = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Node node = queue.poll();
                    if (node != null) queue.addAll(node.children);
                }
                depth++;
            }
            return depth;
        }
    }
}
