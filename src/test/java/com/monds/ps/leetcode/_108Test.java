package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _108Test {

    private _108.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _108.Solution();
    }

    @Test
    public void test() {
        solution.sortedArrayToBST(new int[] {0,1,2,3,4,5});
    }
}
