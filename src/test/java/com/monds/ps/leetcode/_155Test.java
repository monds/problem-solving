package com.monds.ps.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class _155Test {

    @Test
    public void test() {
        _155.MinStack minStack = new _155.MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(minStack.getMin(), -3); // return -3
        minStack.pop();
        assertEquals(minStack.top(), 0);    // return 0
        assertEquals(minStack.getMin(), -2); // return -2
    }
}