package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-06
 */
public class _136Test {

    private _136.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _136.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.singleNumber(new int[] {2,2,1})).isEqualTo(1);
        assertThat(solution.singleNumber(new int[] {4,1,2,1,2})).isEqualTo(4);
    }
}
