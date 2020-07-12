package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-12
 */
public class _28Test {

    private _28.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _28.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.strStr("hello", "ll"), 2);
        assertEquals(solution.strStr("aaaaa", "bba"), -1);
        assertEquals(solution.strStr("a", "a"), 0);
    }
}