package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-06
 */
public class _14Test {

    private _14.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _14.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.longestCommonPrefix(new String[] {"flower", "flow", "flight"}), "fl");
        assertEquals(solution.longestCommonPrefix(new String[] {"dog", "racecar", "car"}), "");
        assertEquals(solution.longestCommonPrefix(new String[] {"aa", "aa"}), "aa");
    }
}