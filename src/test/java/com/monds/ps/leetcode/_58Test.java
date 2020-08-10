package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _58Test {

    private _58.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _58.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.lengthOfLastWord("Hello World")).isEqualTo(5);
    }
}
