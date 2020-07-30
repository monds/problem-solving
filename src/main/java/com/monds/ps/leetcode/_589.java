package com.monds.ps.leetcode;

import java.util.*;

public class _589 {
    static class Solution {
        public List<Integer> preorder(Node root) {
            List<Integer> list = new ArrayList<>();
            if (root == null) return list;
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                Node node = stack.pop();
                list.add(node.val);
                Collections.reverse(node.children);
                for (Node child : node.children) {
                    stack.push(child);
                }
            }
            return list;
        }
    }
}
