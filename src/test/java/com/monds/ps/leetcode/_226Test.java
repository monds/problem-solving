package com.monds.ps.leetcode;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _226Test {

    private _226.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _226.Solution();
    }

    @Test
    public void test() {
        TreeNode root = TreeNode.fromArray(new int[] {4,2,7,1,3,6,9});
        TreeNode expected = TreeNode.fromArray(new int[] {4,7,2,9,6,3,1});

        assertThat(solution.invertTree(root).toArray(), CoreMatchers.is(expected.toArray()));
    }
}