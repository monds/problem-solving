package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _100Test {

    private _100.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _100.Solution();
    }

    @Test
    public void test() {
        assertFalse(solution.isSameTree(null, new TreeNode(0)));
    }
}