package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KthNumberTest {

    @Test
    void test() {
        int[] arr = new int[] {1,5,2,6,3,7,4};
        int[][] commands = new int[][] {{2,5,3}, {4,4,1}, {1,7,3}};
        KthNumber.Solution solution = new KthNumber.Solution();

        assertThat(solution.solution(arr, commands)).isEqualTo(new int[] {5,6,3});
    }
}
