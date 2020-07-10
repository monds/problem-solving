package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-10
 */
public class _66Test {

    private _66.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _66.Solution();
    }

    @Test
    public void test() {
        assertArrayEquals(solution.plusOne(new int[] {1,2,3}), new int[] {1,2,4});
        assertArrayEquals(solution.plusOne(new int[] {4,3,2,1}), new int[] {4,3,2,2});
        assertArrayEquals(solution.plusOne(new int[] {9}), new int[] {1,0});
        assertArrayEquals(solution.plusOne(new int[] {2,4,9,3,9}), new int[] {2,4,9,4,0});
    }
}