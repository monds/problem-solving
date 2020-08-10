package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _796Test {

    private _796.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _796.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.rotateString("abcde", "cdeab")).isTrue();
        assertThat(solution.rotateString("abcde", "abced")).isFalse();
        assertThat(solution.rotateString("bbbacddceeb", "ceebbbbacdd")).isTrue();
    }
}
