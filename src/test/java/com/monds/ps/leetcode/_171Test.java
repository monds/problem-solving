package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-06
 */
public class _171Test {

    private _171.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _171.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.titleToNumber("A"), 1);
        assertEquals(solution.titleToNumber("AB"), 28);
        assertEquals(solution.titleToNumber("ZY"), 701);
    }
}