package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _104Test {

    private _104.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _104.Solution();
    }

    @Test
    public void test() {
        TreeNode root = TreeNode.fromArray(new int[] {3,9,20,-999,-999,15,7});
        assertEquals(solution.maxDepth(root), 3);
    }
}