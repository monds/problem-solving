package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-05
 */
public class _121Test {

    private _121.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _121.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.maxProfit(new int[] {7,1,5,3,6,4})).isEqualTo(5);
        assertThat(solution.maxProfit(new int[] {7,6,4,3,1})).isEqualTo(0);
        assertThat(solution.maxProfit(new int[] {2,4,1})).isEqualTo(2);
        assertThat(solution.maxProfit(new int[] {3,2,6,5,0,3})).isEqualTo(4);
        assertThat(solution.maxProfit(new int[] {1,2})).isEqualTo(1);
    }
}
