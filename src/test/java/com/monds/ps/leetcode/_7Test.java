package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _7Test {

    private _7.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _7.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.reverse(123), 321);
        assertEquals(solution.reverse(-123), -321);
        assertEquals(solution.reverse(120), 21);
    }
}