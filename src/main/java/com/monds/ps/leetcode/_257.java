package com.monds.ps.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _257 {
    static class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> list = new ArrayList<>();
            addPath("", root, list);
            return list;
        }

        private void addPath(String path, TreeNode node, List<String> list) {
            if (node == null) return;
            String newPath = path.equals("") ? node.val + "" : path + "->" + node.val;
            if (node.left == null && node.right == null) list.add(newPath);
            addPath(newPath, node.left, list);
            addPath(newPath, node.right, list);
        }
    }
}
