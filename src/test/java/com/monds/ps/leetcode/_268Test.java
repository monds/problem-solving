package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-17
 */
public class _268Test {

    private _268.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _268.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.missingNumber(new int[] {3,0,1}), 2);
        assertEquals(solution.missingNumber(new int[] {9,6,4,2,3,5,7,0,1}), 8);
    }
}