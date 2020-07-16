package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-16
 */
public class _290Test {

    private _290.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _290.Solution();
    }

    @Test
    public void test() {
        assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
    }
}