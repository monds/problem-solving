package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _543Test {

    private _543.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _543.Solution();
    }

    @Test
    public void test() {
        TreeNode root = TreeNode.fromArray(new int[] {1,2,3,4,5,-999,-999});
        assertThat(solution.diameterOfBinaryTree(root)).isEqualTo(3);
    }
}
