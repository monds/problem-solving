package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _746Test {

    private _746.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _746.Solution();
    }

    @Test
    public void test() {
//        assertEquals(solution.minCostClimbingStairs(new int[] {10,15,20}), 15);
        assertEquals(solution.minCostClimbingStairs(new int[] {1,100,1,100}), 2);
        assertEquals(solution.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}), 6);
    }
}