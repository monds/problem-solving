package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _242Test {

    private _242.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _242.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.isAnagram("anagram", "nagaram")).isTrue();
        assertThat(solution.isAnagram("rat", "car")).isFalse();
    }
}
