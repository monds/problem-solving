package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _111Test {

    private _111.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _111.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.minDepth(TreeNode.fromArray(new int[] {3,9,20,-999,-999,15,7}))).isEqualTo(2);
    }
}
