package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _206Test {

    private _206.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _206.Solution();
    }

    @Test
    public void test() {
        ListNode node = ListNode.fromArray(new int[] {1,2,3,4,5});
        assertArrayEquals(solution.reverseList(node).toArray(), new int[] {5,4,3,2,1});
    }
}
