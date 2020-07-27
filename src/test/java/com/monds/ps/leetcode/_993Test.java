package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-27
 */
public class _993Test {

    private _993.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _993.Solution();
    }

    @Test
    public void test() {
        assertFalse(solution.isCousins(TreeNode.fromArray(new int[] {1,-999,2,3,-999,-999,4,-999,5}), 1, 3));
    }
}