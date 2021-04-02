package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _72411Test {

    @Test
    void test1() {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};

        assertThat(new _72411().solution(orders, course)).containsExactly("AC", "ACDE", "BCFG", "CDE");
    }

    @Test
    void test2() {
        String[] orders = {"XYZ", "XWY", "WXA"};
        int[] course = {2, 3, 4};

        assertThat(new _72411().solution(orders, course)).containsExactly("WX", "XY");

    }
}
