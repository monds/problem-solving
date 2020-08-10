package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _217Test {

    private _217.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _217.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.containsDuplicate(new int[] {1,2,3,1})).isTrue();
        assertThat(solution.containsDuplicate(new int[] {1,2,3,4})).isFalse();
        assertThat(solution.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2})).isTrue();
    }
}
