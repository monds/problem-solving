package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-14
 */
public class _709Test {

    private _709.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _709.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.toLowerCase("Hello"), "hello");
    }
}