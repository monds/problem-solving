package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _7Test {

    private _7.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _7.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.reverse(123)).isEqualTo(321);
        assertThat(solution.reverse(-123)).isEqualTo(-321);
        assertThat(solution.reverse(120)).isEqualTo(21);
    }
}
