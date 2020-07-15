package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _53Test {

    private _53.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _53.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}), 6);
    }
}