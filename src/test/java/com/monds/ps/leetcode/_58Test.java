package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _58Test {

    private _58.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _58.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.lengthOfLastWord("Hello World"), 5);
    }
}