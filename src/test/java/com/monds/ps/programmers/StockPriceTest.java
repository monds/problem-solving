package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StockPriceTest {

    @Test
    void test() {
        StockPrice.Solution solution = new StockPrice.Solution();
        assertThat(solution.solution(new int[] {1, 2, 3, 2, 3})).isEqualTo(new int[] {4, 3, 1, 1, 0});
        assertThat(solution.solution(new int[] {1, 2, 3, 2, 3, 1})).isEqualTo(new int[] {5, 4, 1, 2, 1, 0});
    }
}
