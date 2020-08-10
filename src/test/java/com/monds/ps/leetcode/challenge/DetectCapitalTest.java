package com.monds.ps.leetcode.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-08-01
 */
public class DetectCapitalTest {

    private DetectCapital.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new DetectCapital.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.detectCapitalUse("USA")).isTrue();
        assertThat(solution.detectCapitalUse("FlaG")).isFalse();
        assertThat(solution.detectCapitalUse("leetcode")).isTrue();
    }
}
