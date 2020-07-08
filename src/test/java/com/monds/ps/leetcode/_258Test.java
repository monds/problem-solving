package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-08
 */
public class _258Test {

    private _258.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _258.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.addDigits(38), 2);
    }
}