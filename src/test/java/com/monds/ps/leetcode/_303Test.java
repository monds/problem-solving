package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _303Test {

    private _303.NumArray numArray;

    @Before
    public void setUp() throws Exception {
        numArray = new _303.NumArray(new int[] {-2, 0, 3, -5, 2, -1});
    }

    @Test
    public void test() {
        assertEquals(numArray.sumRange(0, 2), 1);
        assertEquals(numArray.sumRange(2, 5), -1);
        assertEquals(numArray.sumRange(0, 5), -3);
    }
}
