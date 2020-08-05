package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1Test {

    private _1.Solution solution;

    @BeforeEach
    public void setup() {
        solution = new _1.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.twoSum(new int[] {2,7,11,15}, 9)).isEqualTo(new int[] {0,1});
        assertThat(solution.twoSum(new int[] {-1,-2,-3,-4,-5}, -8)).isEqualTo(new int[] {2,4});
    }

}
