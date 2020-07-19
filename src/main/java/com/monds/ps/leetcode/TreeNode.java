package com.monds.ps.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 *
 * 알고리즘 문제를 풀기 위한 용도로 아래 기본 필드를 제외한 부가적인 필드는 일부러 추가하지 않는다.
 * (부모 노드 등)
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    /**
     * 예제를 빠르게 만들기 위한 생성자
     */
    public static TreeNode fromArray(int[] vals) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = null;
        for (int val : vals) {
            if (root == null) {
                root = new TreeNode(val);
                queue.add(root);
                queue.add(root);
            } else {
                TreeNode node = queue.poll();
                if (node != null && val != -999) {
                    if (node.left == null) {
                        TreeNode node1 = new TreeNode(val);
                        node.left = node1;
                        queue.add(node1);
                        queue.add(node1);
                    } else if (node.right == null) {
                        TreeNode node2 = new TreeNode(val);
                        node.right = node2;
                        queue.add(node2);
                        queue.add(node2);
                    }
                }
            }
        }
        return root;
    }

    /**
     * 노드를 결과로 받을 경우 비교를 위해 사용
     * (단 null을 -999로 반환하지는 않는다.)
     */
    public int[] toArray() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);
        ArrayList<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        int[] arr = new int[list.size()];
        int pos = 0;
        for (Integer integer : list) {
            arr[pos++] = integer;
        }
        return arr;
    }

}
