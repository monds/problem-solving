package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-06
 */
public class _14Test {

    private _14.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _14.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.longestCommonPrefix(new String[] {"flower", "flow", "flight"})).isEqualTo("fl");
        assertThat(solution.longestCommonPrefix(new String[] {"dog", "racecar", "car"})).isEqualTo("");
        assertThat(solution.longestCommonPrefix(new String[] {"aa", "aa"})).isEqualTo("aa");
    }
}
