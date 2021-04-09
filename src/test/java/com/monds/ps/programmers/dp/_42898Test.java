package com.monds.ps.programmers.dp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class _42898Test {

    @Test
    void test1() {
        int[][] puddles = {{2, 2}};
        assertThat(new _42898().solution(4, 3, puddles)).isEqualTo(4);
    }

    @Test
    void test2() {
        int[][] puddles = {{}};
        assertThat(new _42898().solution(2, 2, puddles)).isEqualTo(2);
    }

    @Test
    void test3() {
        int[][] puddles = {{2, 1}, {2, 2}, {2, 3}, {4, 2}, {4, 3}, {4, 4}, {6, 2}, {6, 3}};
        assertThat(new _42898().solution(7, 4, puddles)).isEqualTo(2);
    }
}
