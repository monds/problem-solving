package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-24
 */
public class _392Test {

    private _392.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _392.Solution();
    }

    @Test
    public void test() {
        assertFalse(solution.isSubsequence("aaaaaa","bbaaaa"));
        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }
}