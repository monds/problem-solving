package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _205Test {

    private _205.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _205.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.isIsomorphic("egg", "add")).isTrue();
        assertThat(solution.isIsomorphic("foo", "bar")).isFalse();
        assertThat(solution.isIsomorphic("paper", "title")).isTrue();
    }
}
