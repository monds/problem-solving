package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _12949Test {

    @Test
    void test1() {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        assertThat(new _12949().solution(arr1, arr2)).isEqualTo(new int[][] {{15,15},{15,15},{15,15}});
    }

    @Test
    void test2() {
        int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};

        assertThat(new _12949().solution(arr1, arr2)).isEqualTo(new int[][] {{22,22,11}, {36,28,18}, {29,20,14}});
    }

    @Test
    void test3() {
        int[][] arr1 = {{1,2,3},{4,5,6}};
        int[][] arr2 = {{1,4},{2,5},{3,6}};

        assertThat(new _12949().solution(arr1, arr2)).isEqualTo(new int[][] {{14,32},{32,77}});
    }
}
