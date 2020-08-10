package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _108Test {

    private _108.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _108.Solution();
    }

    @Test
    public void test() {
        solution.sortedArrayToBST(new int[] {0,1,2,3,4,5});
    }
}
