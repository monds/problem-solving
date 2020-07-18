package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import static org.junit.Assert.*;

public class _112Test {

    private _112.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _112.Solution();
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(5, new TreeNode(4), new TreeNode(8));
        TreeNode node11 = new TreeNode(11, new TreeNode(7), new TreeNode(2));
        root.left.left = node11;

        TreeNode node13 = new TreeNode(13);
        root.right.left = node13;
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        assertTrue(solution.hasPathSum(root, 22));
    }
}