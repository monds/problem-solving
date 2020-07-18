package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-17
 */
public class _202Test {

    private _202.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _202.Solution();
    }

    @Test
    public void test() {
        assertTrue(solution.isHappy(19));
    }
}