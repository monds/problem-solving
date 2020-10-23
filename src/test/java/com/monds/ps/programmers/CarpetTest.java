package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarpetTest {

    @Test
    void test() {
        Carpet.Solution solution = new Carpet.Solution();
        assertThat(solution.solution(10, 2)).isEqualTo(new int[] {4, 3});
        assertThat(solution.solution(8, 1)).isEqualTo(new int[] {3, 3});
        assertThat(solution.solution(24, 24)).isEqualTo(new int[] {8, 6});
    }
}
