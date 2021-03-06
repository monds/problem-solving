package com.monds.ps.jfct.shortest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FutureCityTest {

    @Test
    void testFutureCity1() {
        int[][] map = {
            {1, 2},
            {1, 3},
            {1, 4},
            {2, 4},
            {3, 4},
            {3, 5},
            {4, 5}
        };

        assertThat(FutureCity.solution(5, 7, 4, 5, map)).isEqualTo(3);
    }

    @Test
    void testFutureCity2() {
        int[][] map = {
            {1, 3},
            {2, 4}
        };

        assertThat(FutureCity.solution(4, 2, 3, 4, map)).isEqualTo(-1);
    }
}
