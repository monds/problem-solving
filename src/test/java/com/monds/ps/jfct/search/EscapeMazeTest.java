package com.monds.ps.jfct.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class EscapeMazeTest {

    @Test
    void solution() {
        int[][] graph = {
            {1,0,1,0,1,0},
            {1,1,1,1,1,1},
            {0,0,0,0,0,1},
            {1,1,1,1,1,1},
            {1,1,1,1,1,1}
        };
        assertThat(new EscapeMaze().solution(5, 6, graph)).isEqualTo(10);
    }
}
