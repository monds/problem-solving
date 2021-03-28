package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheLargestSquareTest {

    @Test
    void solution() {

        int[][] board = {
                {0,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {0,0,1,0}
        };

        assertThat(new FindTheLargestSquare().solution(board)).isEqualTo(9);
    }
}
