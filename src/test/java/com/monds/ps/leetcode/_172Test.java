package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-06
 */
public class _172Test {

    private _172.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _172.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.trailingZeroes(3)).isEqualTo(0);
        assertThat(solution.trailingZeroes(5)).isEqualTo(1);
        assertThat(solution.trailingZeroes(29)).isEqualTo(6);
    }
}
