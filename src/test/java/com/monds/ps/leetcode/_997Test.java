package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _997Test {

    private _997.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _997.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.findJudge(4, new int[][] {{1,3},{1,4},{2,3},{2,4},{4,3}})).isEqualTo(3);
    }
}
