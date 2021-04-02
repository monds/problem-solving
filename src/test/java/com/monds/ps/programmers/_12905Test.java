package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _12905Test {

    @Test
    void solution() {

        int[][] board = {
                {0,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {0,0,1,0}
        };

        assertThat(new _12905().solution(board)).isEqualTo(9);
    }
}
