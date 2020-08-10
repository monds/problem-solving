package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _70Test {

    private _70.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _70.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.climbStairs(2)).isEqualTo(2);
        assertThat(solution.climbStairs(3)).isEqualTo(3);
    }
}
