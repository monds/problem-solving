package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _169Test {

    private _169.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _169.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.majorityElement(new int[] {3,2,3}), 3);
        assertEquals(solution.majorityElement(new int[] {2,2,1,1,1,2,2}), 2);
    }
}