package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-06
 */
public class _171Test {

    private _171.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _171.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.titleToNumber("A")).isEqualTo(1);
        assertThat(solution.titleToNumber("AB")).isEqualTo(28);
        assertThat(solution.titleToNumber("ZY")).isEqualTo(701);
    }
}
