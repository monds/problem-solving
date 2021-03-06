package com.monds.ps.jfct.shortest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TelegramTest {

    @Test
    void solution() {
        int[][] map = {
            {1, 2, 4},
            {1, 3, 2}
        };
        int[] result = {2, 4};

        assertThat(Telegram.solution(3, 2, 1, map)).isEqualTo(result);
    }
}
