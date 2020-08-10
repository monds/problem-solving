package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-09
 */
public class _20Test {

    private _20.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _20.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.isValid("()")).isTrue();
        assertThat(solution.isValid("()[]{}")).isTrue();
        assertThat(solution.isValid("(]")).isFalse();
        assertThat(solution.isValid("([)]")).isFalse();
        assertThat(solution.isValid("{[]}")).isTrue();
    }
}
