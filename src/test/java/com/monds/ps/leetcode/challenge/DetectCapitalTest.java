package com.monds.ps.leetcode.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-08-01
 */
public class DetectCapitalTest {

    private DetectCapital.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new DetectCapital.Solution();
    }

    @Test
    public void test() {
        assertTrue(solution.detectCapitalUse("USA"));
        assertFalse(solution.detectCapitalUse("FlaG"));
        assertTrue(solution.detectCapitalUse("leetcode"));
    }
}