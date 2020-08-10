package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _169Test {

    private _169.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _169.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.majorityElement(new int[] {3,2,3})).isEqualTo(3);
        assertThat(solution.majorityElement(new int[] {2,2,1,1,1,2,2})).isEqualTo(2);
    }
}
