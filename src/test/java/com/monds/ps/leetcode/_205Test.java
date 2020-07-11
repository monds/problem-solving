package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _205Test {

    private _205.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _205.Solution();
    }

    @Test
    public void test() {
        assertTrue(solution.isIsomorphic("egg", "add"));
        assertFalse(solution.isIsomorphic("foo", "bar"));
        assertTrue(solution.isIsomorphic("paper", "title"));
    }
}