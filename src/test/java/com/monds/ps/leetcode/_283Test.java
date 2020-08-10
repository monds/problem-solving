package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-14
 */
public class _283Test {

    private _283.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _283.Solution();
    }

    @Test
    public void test() {
        int[] arr = {0,1,0,3,12};
        solution.moveZeroes(arr);
        assertThat(arr).isEqualTo(new int[] {1,3,12,0,0});
    }
}
