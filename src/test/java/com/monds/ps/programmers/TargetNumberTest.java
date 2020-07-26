package com.monds.ps.programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TargetNumberTest {

    private TargetNumber.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new TargetNumber.Solution();
    }

    @Test
    public void test() {
        assertEquals(solution.solution(new int[] {1,1,1,1,1}, 3), 5);
    }
}