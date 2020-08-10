package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _112Test {

    private _112.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _112.Solution();
    }

    @Test
    public void test() {
        TreeNode root = TreeNode.fromArray(new int[] {5,4,8,11,-999,13,4,7,2,-999,-999,-999,1});

        assertThat(solution.hasPathSum(root, 22)).isTrue();
    }
}
