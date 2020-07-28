package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _198Test {

    private _198.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _198.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.rob(new int[] {1,2,3,1}), 4);
        assertEquals(solution.rob(new int[] {2,7,9,3,1}), 12);
    }
}