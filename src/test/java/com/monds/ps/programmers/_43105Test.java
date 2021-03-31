package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _43105Test {

    @Test
    void solution() {
        int[][] triangle = {{7},{3, 8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        assertThat(new _43105().solution(triangle)).isEqualTo(30);
    }
}
