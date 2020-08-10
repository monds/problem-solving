package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _198Test {

    private _198.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _198.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.rob(new int[] {1,2,3,1})).isEqualTo(4);
        assertThat(solution.rob(new int[] {2,7,9,3,1})).isEqualTo(12);
    }
}
