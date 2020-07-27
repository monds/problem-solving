package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _111Test {

    private _111.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _111.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.minDepth(TreeNode.fromArray(new int[] {3,9,20,-999,-999,15,7})), 2);
    }
}