package com.monds.ps.hackerrank.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SuperReducedStringsTest {

    @Test
    void superReducedString() {

        assertThat(SuperReducedStrings.superReducedString("aaabccddd")).isEqualTo("abd");
        assertThat(SuperReducedStrings.superReducedString("aa")).isEqualTo("");
        assertThat(SuperReducedStrings.superReducedString("baab")).isEqualTo("");
    }
}
