package com.monds.ps.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TreeNodeTest {

    @Test
    public void test() {
        int[] arr = {4,2,7,1,3,6,9};
        TreeNode root = TreeNode.fromArray(arr);

        assertThat(root.toArray()).isEqualTo(arr);
    }
}
