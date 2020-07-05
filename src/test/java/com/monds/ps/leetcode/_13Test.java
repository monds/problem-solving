package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _13Test {

    private _13.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _13.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.romanToInt("III"), 3);
        assertEquals(solution.romanToInt("IV"), 4);
        assertEquals(solution.romanToInt("IX"), 9);
        assertEquals(solution.romanToInt("LVIII"), 58);
        assertEquals(solution.romanToInt("MCMXCIV"), 1994);
    }
}