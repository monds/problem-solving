package com.monds.ps.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TargetNumberTest {

    private TargetNumber.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new TargetNumber.Solution();
    }

    @Test
    public void test() {
        assertThat(solution.solution(new int[] {1,1,1,1,1}, 3)).isEqualTo(5);
    }
}
