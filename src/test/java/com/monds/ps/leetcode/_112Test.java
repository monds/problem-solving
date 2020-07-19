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
        TreeNode root = TreeNode.fromArray(new int[] {5,4,8,11,-999,13,4,7,2,-999,-999,-999,1});

        assertTrue(solution.hasPathSum(root, 22));
    }
}