package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _9Test {

    private _9.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _9.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.isPalindrome(121)).isTrue();
        assertThat(solution.isPalindrome(-121)).isFalse();
        assertThat(solution.isPalindrome(10)).isFalse();
    }
}
