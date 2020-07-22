package com.monds.ps.leetcode;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-22
 */
public class _1002Test {

    private _1002.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _1002.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.commonChars(new String[]{"bella","label","roller"}), CoreMatchers.is(Arrays.asList("e", "l", "l")));
    }
}