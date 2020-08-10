package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-08
 */
public class _258Test {

    private _258.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _258.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.addDigits(38)).isEqualTo(2);
    }
}
