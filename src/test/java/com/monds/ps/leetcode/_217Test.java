package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _217Test {

    private _217.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _217.Solution();
    }

    @Test
    public void test() {
        assertTrue(solution.containsDuplicate(new int[] {1,2,3,1}));
        assertFalse(solution.containsDuplicate(new int[] {1,2,3,4}));
        assertTrue(solution.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }
}