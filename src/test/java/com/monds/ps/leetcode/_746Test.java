package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _746Test {

    private _746.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _746.Solution();
    }

    @Test
    public void test() {
//        assertThat(solution.minCostClimbingStairs(new int[] {10,15,20}), 15);
        assertThat(solution.minCostClimbingStairs(new int[] {1,100,1,100})).isEqualTo(2);
        assertThat(solution.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1})).isEqualTo(6);
    }
}
