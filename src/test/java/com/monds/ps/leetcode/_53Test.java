package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _53Test {

    private _53.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _53.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4})).isEqualTo(6);
    }
}
