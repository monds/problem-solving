package com.monds.ps.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _155Test {

    @Test
    public void test() {
        _155.MinStack minStack = new _155.MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertThat(minStack.getMin()).isEqualTo(-3); // return -3
        minStack.pop();
        assertThat(minStack.top()).isEqualTo(0);    // return 0
        assertThat(minStack.getMin()).isEqualTo(-2); // return -2
    }
}
