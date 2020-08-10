package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-07-22
 */
public class _1002Test {

    private _1002.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _1002.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.commonChars(new String[]{"bella","label","roller"}).toArray())
            .isEqualTo(Arrays.asList("e", "l", "l").toArray());
    }
}
