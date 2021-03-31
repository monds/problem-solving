package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _42884Test {

    @Test
    void solution() {
        int[][] routes = {{-20,15}, {-14,-5}, {-18,-13}, {-5,-3}};

        assertThat(new _42884().solution(routes)).isEqualTo(2);
    }
}
