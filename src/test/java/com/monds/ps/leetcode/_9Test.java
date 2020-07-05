package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _9Test {

    private _9.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _9.Solution();
    }

    @Test
    public void test() {
        assertTrue(solution.isPalindrome(121));
        assertFalse(solution.isPalindrome(-121));
        assertFalse(solution.isPalindrome(10));
    }
}