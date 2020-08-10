package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-14
 */
public class _709Test {

    private _709.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _709.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.toLowerCase("Hello")).isEqualTo("hello");
    }
}
