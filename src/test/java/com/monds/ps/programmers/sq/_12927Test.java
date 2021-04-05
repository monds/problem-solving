package com.monds.ps.programmers.sq;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _12927Test {

    @Test
    void test() {
        assertThat(new _12927().solution(4, new int[] {4, 3, 3})).isEqualTo(12);
        assertThat(new _12927().solution(1, new int[] {2, 1, 2})).isEqualTo(6);
    }
}
