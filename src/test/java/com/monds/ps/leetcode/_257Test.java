package com.monds.ps.leetcode;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;

public class _257Test {

    private _257.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _257.Solution();
    }

    @Test
    public void test() {
        TreeNode root = TreeNode.fromArray(new int[] {1,2,3,-999,5,-999,-999});
        List<String> expected = Arrays.asList("1->2->5", "1->3");

        assertThat(solution.binaryTreePaths(root), CoreMatchers.is(expected));
    }
}