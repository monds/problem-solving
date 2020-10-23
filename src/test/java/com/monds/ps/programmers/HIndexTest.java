package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HIndexTest {

    @Test
    void test() {
        HIndex.Solution solution = new HIndex.Solution();
        assertThat(solution.solution(new int[] {3, 0, 6, 1, 5})).isEqualTo(3);
        assertThat(solution.solution(new int[] {12, 11, 10, 9, 8, 1})).isEqualTo(5);
        assertThat(solution.solution(new int[] {6, 6, 6, 6, 6, 1})).isEqualTo(5);
        assertThat(solution.solution(new int[] {4, 4, 4})).isEqualTo(3);
        assertThat(solution.solution(new int[] {4, 4, 4, 5, 0, 1, 2, 3})).isEqualTo(4);
        assertThat(solution.solution(new int[] {10, 11, 12, 13})).isEqualTo(4);
        assertThat(solution.solution(new int[] {0, 0, 1, 1})).isEqualTo(1);
    }
}
