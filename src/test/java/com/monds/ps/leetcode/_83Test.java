package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _83Test {

    private _83.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _83.Solution();
    }

    @Test
    public void test() {
        ListNode list = ListNode.fromArray(new int[] {1,1,2});
        assertThat(solution.deleteDuplicates(list).toArray()).isEqualTo(new int[] {1,2});
        ListNode list2 = ListNode.fromArray(new int[] {1,1,2,3,3});
        assertThat(solution.deleteDuplicates(list2).toArray()).isEqualTo(new int[] {1,2,3});
    }
}
