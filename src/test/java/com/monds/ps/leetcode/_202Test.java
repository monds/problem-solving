package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-17
 */
public class _202Test {

    private _202.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _202.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.isHappy(19)).isTrue();
    }
}
