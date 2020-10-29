package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SteppingStoneTest {

    @Test
    void test() {
        SteppingStone steppingStone = new SteppingStone();
        assertThat(steppingStone.solution(25, new int[] {2, 14, 11, 21, 17}, 2)).isEqualTo(4);
    }
}
