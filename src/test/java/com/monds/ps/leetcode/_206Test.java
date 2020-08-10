package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _206Test {

    private _206.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _206.Solution();
    }

    @Test
    public void test() {
        ListNode node = ListNode.fromArray(new int[] {1,2,3,4,5});
        assertThat(solution.reverseList(node).toArray()).isEqualTo(new int[] {5,4,3,2,1});
    }
}
