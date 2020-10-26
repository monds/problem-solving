package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by monds on 2020-10-25
 */
public class ImmigrationTest {

    @Test
    void test() {
        Immigration immigration = new Immigration();
        assertThat(immigration.solution(6, new int[] {7, 10})).isEqualTo(28);
    }
}
