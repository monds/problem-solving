package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-27
 */
public class _993Test {

    private _993.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _993.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.isCousins(TreeNode.fromArray(new int[] {1,-999,2,3,-999,-999,4,-999,5}), 1, 3))
            .isFalse();
    }
}
