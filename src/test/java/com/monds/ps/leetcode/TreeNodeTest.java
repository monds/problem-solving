package com.monds.ps.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TreeNodeTest {

    @Test
    public void test() {
        int[] arr = new int[] {4,2,7,1,3,6,9};
        TreeNode root = TreeNode.fromArray(arr);

        assertArrayEquals(root.toArray(), arr);
    }
}