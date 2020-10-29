package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DoublePriorityQueueTest {

    @Test
    void test() {
        DoublePriorityQueue doublePriorityQueue = new DoublePriorityQueue();
        assertThat(doublePriorityQueue.solution(new String[] {"I 16", "D 1"}))
            .isEqualTo(new int[] {0, 0});
        assertThat(doublePriorityQueue.solution(new String[] {"I 7", "I 5", "I -5", "D -1"}))
            .isEqualTo(new int[] {7, 5});
    }

    @Test
    void test_fail() {
        DoublePriorityQueue doublePriorityQueue = new DoublePriorityQueue();
        assertThat(doublePriorityQueue.solution(new String[] {"I 4", "I 3", "I 2", "I 1", "D 1", "D 1", "D -1", "D -1", "I 5", "I 6"}))
            .isEqualTo(new int[] {6, 5});
    }
}
