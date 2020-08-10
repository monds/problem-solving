package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _110Test {

    private _110.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _110.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.isBalanced(TreeNode.fromArray(new int[] {3,9,20,-999,-999,15,7}))).isTrue();
    }
}
