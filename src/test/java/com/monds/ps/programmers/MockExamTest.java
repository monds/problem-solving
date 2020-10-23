package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MockExamTest {

    @Test
    void test() {
        MockExam.Solution problem = new MockExam.Solution();
        assertThat(problem.solution(new int[] {1,2,3,4,5})).isEqualTo(new int[] {1});
        assertThat(problem.solution(new int[] {1,3,2,4,2})).isEqualTo(new int[] {1,2,3});
    }
}
