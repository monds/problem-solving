package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _110Test {

    private _110.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _110.Solution();
    }

    @Test
    public void test() {
        assertTrue(solution.isBalanced(TreeNode.fromArray(new int[] {3,9,20,-999,-999,15,7})));
    }
}
