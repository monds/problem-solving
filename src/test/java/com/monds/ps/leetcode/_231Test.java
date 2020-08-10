package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-13
 */
public class _231Test {

    private _231.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _231.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.isPowerOfTwo(1)).isTrue();
        assertThat(solution.isPowerOfTwo(16)).isTrue();
        assertThat(solution.isPowerOfTwo(218)).isFalse();
        assertThat(solution.isPowerOfTwo(0)).isFalse();
    }
}
