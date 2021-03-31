package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _42895Test {

    @Test
    void solution() {
        assertThat(new _42895().solution(5, 12)).isEqualTo(4);
    }
}
