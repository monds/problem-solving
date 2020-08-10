package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-12
 */
public class _28Test {

    private _28.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _28.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.strStr("hello", "ll")).isEqualTo(2);
        assertThat(solution.strStr("aaaaa", "bba")).isEqualTo(-1);
        assertThat(solution.strStr("a", "a")).isEqualTo(0);
    }
}
