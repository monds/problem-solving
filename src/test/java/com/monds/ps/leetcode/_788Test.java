package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _788Test {

    private _788.Solution solution;

    @Before
    public void setup() {
        solution = new _788.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.rotatedDigits(10), 4);
        assertEquals(solution.rotatedDigits(857), 247);
    }
}