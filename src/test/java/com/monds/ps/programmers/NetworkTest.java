package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NetworkTest {

    @Test
    void test() {
        Network network = new Network();
        assertThat(network.solution(3, new int[][] {{1,1,0},{1,1,0},{0,0,1}})).isEqualTo(2);
        assertThat(network.solution(3, new int[][] {{1,1,0},{1,1,1},{0,1,1}})).isEqualTo(1);
    }
}
