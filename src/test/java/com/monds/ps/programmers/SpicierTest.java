package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpicierTest {

    @Test
    void test() {
        Spicier spicier = new Spicier();
        assertThat(spicier.solution(new int[] {1, 2, 3, 9, 10, 12}, 7)).isEqualTo(2);
        assertThat(spicier.solution(new int[] {1, 1, 1, 1, 1, 1}, 3)).isEqualTo(3);
        assertThat(spicier.solution(new int[] {1, 1, 1, 1, 1, 1}, 100)).isEqualTo(-1);
        assertThat(spicier.solution(new int[] {1, 2, 3, 4, 5, 6}, 3)).isEqualTo(1);
        assertThat(spicier.solution(new int[] {1, 2, 3, 4, 5, 6}, 100)).isEqualTo(-1);
        assertThat(spicier.solution(new int[] {1, 2, 3}, 11)).isEqualTo(2);
        assertThat(spicier.solution(new int[] {1, 1, 2}, 3)).isEqualTo(2);
    }
}
