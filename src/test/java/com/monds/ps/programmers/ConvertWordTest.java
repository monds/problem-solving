package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertWordTest {

    @Test
    void test() {
        ConvertWord convertWord = new ConvertWord();
        assertThat(convertWord.solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"}))
            .isEqualTo(4);
        assertThat(convertWord.solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log"}))
            .isEqualTo(0);
        assertThat(convertWord.solution("hit", "hhh", new String[] {"hhh", "hht"}))
            .isEqualTo(2);
    }
}
