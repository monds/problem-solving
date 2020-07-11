package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _796Test {

    private _796.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _796.Solution();
    }

    @Test
    public void test() {
        assertTrue(solution.rotateString("abcde", "cdeab"));
        assertFalse(solution.rotateString("abcde", "abced"));
        assertTrue(solution.rotateString("bbbacddceeb", "ceebbbbacdd"));
    }
}