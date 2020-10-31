package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateLargeNumberTest {

    @Test
    void test() {
        CreateLargeNumber createLargeNumber = new CreateLargeNumber();
        assertThat(createLargeNumber.solution("1924", 2)).isEqualTo("94");
        assertThat(createLargeNumber.solution("1231234", 3)).isEqualTo("3234");
        assertThat(createLargeNumber.solution("4177252841", 4)).isEqualTo("775841");
    }
}
