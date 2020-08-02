package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _234Test {

    private _234.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _234.Solution();
    }

    @Test
    public void test() {
        assertFalse(solution.isPalindrome(ListNode.fromArray(new int[] {1,2})));
        assertTrue(solution.isPalindrome(ListNode.fromArray(new int[] {1,2,2,1})));
    }
}
