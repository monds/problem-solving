package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiskControllerTest {

    @Test
    void test() {
        DiskController diskController = new DiskController();
        assertThat(diskController.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}})).isEqualTo(9);
    }

    @Test
    void test2() {
        DiskController diskController = new DiskController();
        assertThat(diskController.solution(new int[][]{{0, 3}, {1, 9}, {500, 6}})).isEqualTo(6);
    }
}
