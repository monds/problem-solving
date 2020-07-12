package com.monds.ps.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-07-12
 */
public class _344Test {

    private _344.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new _344.Solution();
    }

    @Test
    public void test() {
        char[] arr1 = new char[] {'h','e','l','l','o'};
        solution.reverseString(arr1);
        assertArrayEquals(arr1, new char[] {'o','l','l','e','h'});
    }
}