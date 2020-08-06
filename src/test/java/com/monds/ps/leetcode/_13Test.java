package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _13Test {

    private _13.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _13.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.romanToInt("III")).isEqualTo(3);
        assertThat(solution.romanToInt("IV")).isEqualTo(4);
        assertThat(solution.romanToInt("IX")).isEqualTo(9);
        assertThat(solution.romanToInt("LVIII")).isEqualTo(58);
        assertThat(solution.romanToInt("MCMXCIV")).isEqualTo(1994);
    }
}
