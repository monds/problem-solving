package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-06
 */
public class _172Test {

    private _172.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _172.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.trailingZeroes(3), 0);
        assertEquals(solution.trailingZeroes(5), 1);
        assertEquals(solution.trailingZeroes(29), 6);
    }
}