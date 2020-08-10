package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _448Test {

    private _448.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _448.Solution();
    }

    @Test
    public void test() {
        List<Integer> actual = solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        assertThat(actual.toArray()).isEqualTo(Arrays.asList(5,6).toArray());
    }
}
