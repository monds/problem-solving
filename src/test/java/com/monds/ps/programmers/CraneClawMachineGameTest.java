package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CraneClawMachineGameTest {

    @Test
    void test1() {
        CraneClawMachineGame game = new CraneClawMachineGame();
        assertThat(game.solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}},
            new int[] {1,5,3,5,1,2,1,4})).isEqualTo(4);
    }

    @Test
    void test2() {
        CraneClawMachineGame game = new CraneClawMachineGame();
        assertThat(game.solution(new int[][] {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{11,0,0,0,10},{11,0,0,0,10}},
            new int[] {1,5,3,5,1,2,1,4})).isEqualTo(4);
    }

    @Test
    void test3() {
        CraneClawMachineGame game = new CraneClawMachineGame();
        assertThat(game.solution(new int[][]{{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3}},
            new int[]{1,5,3,5,1,2,1,4}))
            .isEqualTo(8);
    }
}
