package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-09
 */
public class _20Test {

    private _20.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _20.Solution();
    }

    @Test
    public void test() {
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("()[]{}"));
        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("([)]"));
        assertTrue(solution.isValid("{[]}"));
    }
}