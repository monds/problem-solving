package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _12899Test {

    @Test
    void solution() {
        _12899 question = new _12899();

        assertThat(question.solution(1)).isEqualTo("1");
        assertThat(question.solution(2)).isEqualTo("2");
        assertThat(question.solution(3)).isEqualTo("4");
        assertThat(question.solution(4)).isEqualTo("11");
    }
}
