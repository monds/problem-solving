package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _788Test {

    private _788.Solution solution;

    @BeforeEach
    public void setup() {
        solution = new _788.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.rotatedDigits(10)).isEqualTo(4);
        assertThat(solution.rotatedDigits(857)).isEqualTo(247);
    }
}
