package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _70Test {

    private _70.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _70.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.climbStairs(2), 2);
        assertEquals(solution.climbStairs(3), 3);
    }
}