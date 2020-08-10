package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-24
 */
public class _392Test {

    private _392.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _392.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.isSubsequence("aaaaaa","bbaaaa")).isFalse();
        assertThat(solution.isSubsequence("abc", "ahbgdc")).isTrue();
        assertThat(solution.isSubsequence("axc", "ahbgdc")).isFalse();
    }
}
