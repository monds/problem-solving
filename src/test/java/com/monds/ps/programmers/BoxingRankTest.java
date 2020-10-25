package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoxingRankTest {

    @Test
    void test() {
        BoxingRank boxingRank = new BoxingRank();
        assertThat(boxingRank.solution(5, new int[][] {{4,3},{4,2},{3,2},{1,2},{2,5}}))
            .isEqualTo(2);
        assertThat(boxingRank.solution(8, new int[][] {{1, 2}, {2, 3}, {3, 4}, {5, 6}, {6, 7}, {7, 8}}))
            .isEqualTo(0);
        assertThat(boxingRank.solution(3, new int[][] {{1, 2}, {2, 3}, {3, 1}}))
            .isEqualTo(0);
    }

}
