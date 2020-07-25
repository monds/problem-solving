package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _141Test {

    private _141.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _141.Solution();
    }

    @Test
    public void test() {
        ListNode head = new ListNode(3);
        ListNode n1 = new ListNode(2);
        head.next = n1;
        n1.next = new ListNode(0);
        n1.next.next = new ListNode(-4);
        n1.next.next.next = n1;

        assertTrue(solution.hasCycle(head));
    }
}