package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _100Test {

    private _100.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _100.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.isSameTree(null, new TreeNode(0))).isFalse();
    }
}
