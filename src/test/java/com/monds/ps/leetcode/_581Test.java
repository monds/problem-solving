package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _581Test {

    private _581.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _581.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15})).isEqualTo(5);
    }
}
