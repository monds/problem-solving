package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _872Test {

    private _872.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _872.Solution();
    }

    @Test
    public void test() {
        TreeNode node1 = TreeNode.fromArray(new int[] {3,5,1,6,2,9,8,-999,-999,7,4});
        TreeNode node2 = TreeNode.fromArray(new int[] {3,5,1,6,7,4,2,-999,-999,-999,-999,-999,-999,9,8});

        assertTrue(solution.leafSimilar(node1, node2));
    }
}
