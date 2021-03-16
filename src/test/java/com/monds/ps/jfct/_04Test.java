package com.monds.ps.jfct;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _04Test {

    @Test
    void solution() {
        assertThat(_04.solution(new int[] {3, 2, 1, 1, 9})).isEqualTo(8);
    }
}
