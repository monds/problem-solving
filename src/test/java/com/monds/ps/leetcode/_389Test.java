package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _389Test {

    private _389.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _389.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.findTheDifference("abcd", "abcde")).isEqualTo('e');
        assertThat(solution.findTheDifference("", "y")).isEqualTo('y');
    }
}
