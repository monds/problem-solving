package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by monds on 2020-11-01
 */
public class LifeboatTest {

    @Test
    void test() {
        Lifeboat lifeboat = new Lifeboat();
        assertThat(lifeboat.solution(new int[] {70, 50, 80, 50}, 100)).isEqualTo(3);
        assertThat(lifeboat.solution(new int[] {70, 80, 50}, 100)).isEqualTo(3);
        assertThat(lifeboat.solution(new int[] {40, 40, 40}, 100)).isEqualTo(2);
    }
}
