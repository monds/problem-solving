package com.monds.ps.jfct;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _07Test {

    @Test
    void solution() {
        assertThat(_07.solution(123402)).isEqualTo("LUCKY");
        assertThat(_07.solution(7755)).isEqualTo("READY");
    }
}
