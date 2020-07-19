package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _543Test {

    private _543.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _543.Solution();
    }

    @Test
    public void test() {
        TreeNode root = TreeNode.fromArray(new int[] {1,2,3,4,5,-999,-999});
        assertEquals(solution.diameterOfBinaryTree(root), 3);
    }
}