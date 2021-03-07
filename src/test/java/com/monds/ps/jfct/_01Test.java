package com.monds.ps.jfct;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _01Test {

    @Test
    void solution() {
        assertThat(_01.solution(5, new int[] {2, 3, 1, 2, 2})).isEqualTo(2);
        assertThat(_01.solution(5, new int[] {2, 2, 1, 2, 2})).isEqualTo(3);
    }
}
