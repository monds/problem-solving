package com.monds.ps.jfct;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _05Test {

    @Test
    void solution() {
        assertThat(_05.solution(5, 3, new int[] {1, 3, 2, 3, 2})).isEqualTo(8);
        assertThat(_05.solution(8, 5, new int[] {1, 5, 4, 3, 2, 4, 5, 2})).isEqualTo(25);
    }
}
