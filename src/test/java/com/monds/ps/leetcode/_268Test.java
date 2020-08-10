package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-17
 */
public class _268Test {

    private _268.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _268.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.missingNumber(new int[] {3,0,1})).isEqualTo(2);
        assertThat(solution.missingNumber(new int[] {9,6,4,2,3,5,7,0,1})).isEqualTo(8);
    }
}
