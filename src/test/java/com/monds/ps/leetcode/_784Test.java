package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by suahn on 2020-07-14
 */
public class _784Test {

    private _784.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _784.Solution();
    }

    @Test
    public void test() {
        List<String> res = Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2");
        assertThat(solution.letterCasePermutation("a1b2"), is(res));
    }
}