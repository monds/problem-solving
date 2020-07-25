package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _21Test {

    private _21.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _21.Solution();
    }

    @Test
    public void test() {
        ListNode l1 = ListNode.fromArray(new int[] {1,2,4});
        ListNode l2 = ListNode.fromArray(new int[] {1,3,4});
        assertArrayEquals(solution.mergeTwoLists(l1, l2).toArray(), new int[] {1,1,2,3,4,4});
    }
}