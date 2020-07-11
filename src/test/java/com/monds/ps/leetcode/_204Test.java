package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.*;

public class _204Test {

    private _204.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _204.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.countPrimes(10), 4);
        assertEquals(solution.countPrimes(2), 0);
        // 150000 test
    }
}