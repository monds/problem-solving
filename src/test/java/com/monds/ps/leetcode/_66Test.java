package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-10
 */
public class _66Test {

    private _66.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _66.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.plusOne(new int[] {1,2,3})).isEqualTo(new int[] {1,2,4});
        assertThat(solution.plusOne(new int[] {4,3,2,1})).isEqualTo(new int[] {4,3,2,2});
        assertThat(solution.plusOne(new int[] {9})).isEqualTo(new int[] {1,0});
        assertThat(solution.plusOne(new int[] {2,4,9,3,9})).isEqualTo(new int[] {2,4,9,4,0});
    }
}
