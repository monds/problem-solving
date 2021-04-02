package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _68935Test {

    @Test
    void test() {
        assertThat(new _68935().solution(45)).isEqualTo(7);
        assertThat(new _68935().solution(125)).isEqualTo(229);
    }
}
