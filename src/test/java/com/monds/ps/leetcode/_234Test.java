package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _234Test {

    private _234.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _234.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.isPalindrome(ListNode.fromArray(new int[] {1,2}))).isFalse();
        assertThat(solution.isPalindrome(ListNode.fromArray(new int[] {1,2,2,1}))).isTrue();
    }
}
