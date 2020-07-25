package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _83Test {

    private _83.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _83.Solution();
    }

    @Test
    public void test() {
        ListNode list = ListNode.fromArray(new int[] {1,1,2});
        assertArrayEquals(solution.deleteDuplicates(list).toArray(), new int[] {1,2});
        ListNode list2 = ListNode.fromArray(new int[] {1,1,2,3,3});
        assertArrayEquals(solution.deleteDuplicates(list2).toArray(), new int[] {1,2,3});
    }
}