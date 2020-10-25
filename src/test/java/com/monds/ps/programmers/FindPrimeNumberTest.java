package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindPrimeNumberTest {

    @Test
    void test() {
        FindPrimeNumber.Solution solution = new FindPrimeNumber.Solution();
        assertThat(solution.solution("17")).isEqualTo(3);
        assertThat(solution.solution("011")).isEqualTo(2);
    }
}
