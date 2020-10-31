package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GymClothesTest {

    @Test
    void test() {
        GymClothes gymClothes = new GymClothes();
        assertThat(gymClothes.solution(5, new int[] {2, 4}, new int[] {1, 3, 5})).isEqualTo(5);
        assertThat(gymClothes.solution(5, new int[] {2, 4}, new int[] {3})).isEqualTo(4);
        assertThat(gymClothes.solution(3, new int[] {3}, new int[] {1})).isEqualTo(2);
        assertThat(gymClothes.solution(5, new int[] {2, 3, 4}, new int[] {3})).isEqualTo(3);
    }
}
