package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-06
 */
public class _136Test {

    private _136.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _136.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.singleNumber(new int[] {2,2,1}), 1);
        assertEquals(solution.singleNumber(new int[] {4,1,2,1,2}), 4);
    }
}