package com.monds.ps.jfct;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _02Test {

    @Test
    void solution() {
        assertThat(_02.solution("02984")).isEqualTo(576);
        assertThat(_02.solution("567")).isEqualTo(210);
    }
}
