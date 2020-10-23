package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrinterTest {

    @Test
    void test() {
        Printer.Solution problem = new Printer.Solution();
        assertThat(problem.solution(new int[] {2, 1, 3, 2}, 2)).isEqualTo(1);
        assertThat(problem.solution(new int[] {1, 1, 9, 1, 1, 1}, 0)).isEqualTo(5);
    }

}
