package com.monds.ps.jfct;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _08Test {

    @Test
    void solution() {
        assertThat(_08.solution("K1KA5CB7")).isEqualTo("ABCKK13");
        assertThat(_08.solution("AJKDLSI412K4JSJ9D")).isEqualTo("ADDIJJJKKLSS20");
    }
}
