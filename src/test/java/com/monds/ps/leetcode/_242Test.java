package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _242Test {

    private _242.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _242.Solution();
    }

    @Test
    public void test() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
        assertFalse(solution.isAnagram("rat", "car"));
    }
}