package com.monds.ps.hackerrank.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PangramsTest {

    @Test
    void pangrams() {
        assertThat(Pangrams.pangrams("We promptly judged antique ivory buckles for the next prize")).isEqualTo("pangram");
    }
}
