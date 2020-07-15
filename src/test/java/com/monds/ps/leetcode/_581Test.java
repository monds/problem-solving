package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _581Test {

    private _581.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _581.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15}), 5);
    }
}