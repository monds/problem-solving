package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _389Test {

    private _389.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _389.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.findTheDifference("abcd", "abcde"), 'e');
        assertEquals(solution.findTheDifference("", "y"), 'y');
    }
}