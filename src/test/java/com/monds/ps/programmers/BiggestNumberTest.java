package com.monds.ps.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BiggestNumberTest {

    private BiggestNumber.Solution biggestNumber;

    @BeforeEach
    public void setUp() {
        biggestNumber = new BiggestNumber.Solution();
    }

    @Test
    void test() {
        assertThat(biggestNumber.solution(new int[] {6, 2, 10})).isEqualTo("6210");
        assertThat(biggestNumber.solution(new int[] {3, 30, 34, 5, 9})).isEqualTo("9534330");
        assertThat(biggestNumber.solution(new int[] {0, 0, 0, 0, 0})).isEqualTo("0");
    }
}
