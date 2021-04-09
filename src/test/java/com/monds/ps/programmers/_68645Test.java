package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _68645Test {

    @Test
    void test() {
        int[] answer = {1,2,9,3,10,8,4,5,6,7};
        assertThat(new _68645().solution(4)).isEqualTo(answer);
    }
}
