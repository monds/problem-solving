package com.monds.ps.hackerrank.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @Test
    void caesarCipher() {
        assertThat(CaesarCipher.caesarCipher("middle-Outz", 2)).isEqualTo("okffng-Qwvb");
    }
}
