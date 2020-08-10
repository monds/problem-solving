package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _104Test {

    private _104.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _104.Solution();
    }

    @Test
    public void test() {
        TreeNode root = TreeNode.fromArray(new int[] {3,9,20,-999,-999,15,7});
        assertThat(solution.maxDepth(root)).isEqualTo(3);
    }
}
