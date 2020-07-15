package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class _448Test {

    private _448.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _448.Solution();
    }

    @Test
    public void test() {
        List<Integer> actual = solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        assertThat(actual, is(Arrays.asList(5,6)));
    }
}