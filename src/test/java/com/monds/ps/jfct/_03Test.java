package com.monds.ps.jfct;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _03Test {

    @Test
    void solution() {
        assertThat(_03.solution("0001100")).isEqualTo(1);
    }
}
