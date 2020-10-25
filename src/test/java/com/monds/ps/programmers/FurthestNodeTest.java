package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FurthestNodeTest {

    @Test
    void test() {
        FurthestNode furthestNode = new FurthestNode();
        assertThat(furthestNode.solution(6, new int[][] {{3,6}, {4,3}, {3,2}, {1,3}, {1,2}, {2,4}, {5,2}}))
            .isEqualTo(3);
    }
}
