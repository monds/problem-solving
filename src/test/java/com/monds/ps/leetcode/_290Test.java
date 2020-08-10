package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-16
 */
public class _290Test {

    private _290.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _290.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.wordPattern("abba", "dog cat cat dog")).isTrue();
        assertThat(solution.wordPattern("abba", "dog dog dog dog")).isFalse();
        assertThat(solution.wordPattern("abba", "dog cat cat fish")).isFalse();
        assertThat(solution.wordPattern("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd",
                "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t")).isTrue();
    }
}
