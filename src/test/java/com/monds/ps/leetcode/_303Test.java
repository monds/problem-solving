package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _303Test {

    private _303.NumArray numArray;

    @BeforeEach
    public void setUp() throws Exception {
        numArray = new _303.NumArray(new int[] {-2, 0, 3, -5, 2, -1});
    }

    @Test
    public void test() {
        assertThat(numArray.sumRange(0, 2)).isEqualTo(1);
        assertThat(numArray.sumRange(2, 5)).isEqualTo(-1);
        assertThat(numArray.sumRange(0, 5)).isEqualTo(-3);
    }
}
