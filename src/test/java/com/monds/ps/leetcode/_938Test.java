package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by monds on 2020-08-12
 */
public class _938Test {

    private _938.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _938.Solution();
    }

    @Test
    void test() {
        TreeNode root = TreeNode.fromArray(new int[]{10, 5, 15, 3, 7, -999, 18});
        assertThat(solution.rangeSumBST(root, 7, 15)).isEqualTo(32);
    }
}
