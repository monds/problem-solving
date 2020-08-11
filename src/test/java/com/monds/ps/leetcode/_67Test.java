package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _67Test {

    private _67.Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new _67.Solution();
    }

    @Test
    void test() {
        assertThat(solution.addBinary("11", "1")).isEqualTo("100");
        assertThat(solution.addBinary("1010", "1011")).isEqualTo("10101");
    }

}
