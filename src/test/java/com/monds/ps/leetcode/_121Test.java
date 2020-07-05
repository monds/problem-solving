package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-05
 */
public class _121Test {

    private _121.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _121.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.maxProfit(new int[] {7,1,5,3,6,4}), 5);
        assertEquals(solution.maxProfit(new int[] {7,6,4,3,1}), 0);
        assertEquals(solution.maxProfit(new int[] {2,4,1}), 2);
        assertEquals(solution.maxProfit(new int[] {3,2,6,5,0,3}), 4);
        assertEquals(solution.maxProfit(new int[] {1,2}), 1);
    }
}