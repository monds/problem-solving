package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-13
 */
public class _231Test {

    private _231.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _231.Solution();
    }

    @Test
    public void test() {
        assertTrue(solution.isPowerOfTwo(1));
        assertTrue(solution.isPowerOfTwo(16));
        assertFalse(solution.isPowerOfTwo(218));
        assertFalse(solution.isPowerOfTwo(0));
    }
}