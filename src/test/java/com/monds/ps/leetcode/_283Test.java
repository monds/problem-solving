package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-14
 */
public class _283Test {

    private _283.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _283.Solution();
    }

    @Test
    public void test() {
        int[] arr = new int[] {0,1,0,3,12};
        solution.moveZeroes(arr);
        assertArrayEquals(arr, new int[] {1,3,12,0,0});
    }
}