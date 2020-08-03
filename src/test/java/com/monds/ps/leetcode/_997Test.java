package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _997Test {

    private _997.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _997.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.findJudge(4, new int[][] {{1,3},{1,4},{2,3},{2,4},{4,3}}), 3);
    }
}
