package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _21Test {

    private _21.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _21.Solution();
    }

    @Test
    public void test() {
        ListNode l1 = ListNode.fromArray(new int[] {1,2,4});
        ListNode l2 = ListNode.fromArray(new int[] {1,3,4});
        assertThat(solution.mergeTwoLists(l1, l2).toArray()).isEqualTo(new int[] {1,1,2,3,4,4});
    }
}
