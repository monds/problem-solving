package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _204Test {

    private _204.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _204.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.countPrimes(10)).isEqualTo(4);
        assertThat(solution.countPrimes(2)).isEqualTo(0);
        // 150000 test
    }
}
