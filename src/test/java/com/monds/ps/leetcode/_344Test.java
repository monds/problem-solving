package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-12
 */
public class _344Test {

    private _344.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _344.Solution();
    }

    @Test
    public void test() {
        char[] arr1 = {'h','e','l','l','o'};
        solution.reverseString(arr1);
        assertThat(arr1).isEqualTo(new char[] {'o','l','l','e','h'});
    }
}
