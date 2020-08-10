package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _257Test {

    private _257.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _257.Solution();
    }

    @Test
    public void test() {
        TreeNode root = TreeNode.fromArray(new int[] {1,2,3,-999,5,-999,-999});
        List<String> expected = Arrays.asList("1->2->5", "1->3");

        assertThat(solution.binaryTreePaths(root).toArray()).isEqualTo(expected.toArray());
    }
}
