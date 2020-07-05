package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1Test {

    private _1.Solution solution;

    @Before
    public void setup() {
        solution = new _1.Solution();
    }

    @Test
    public void test() {
        assertArrayEquals(solution.twoSum(new int[] {2,7,11,15}, 9), new int[] {0,1});
        assertArrayEquals(solution.twoSum(new int[] {-1,-2,-3,-4,-5}, -8), new int[] {2,4});
    }

}