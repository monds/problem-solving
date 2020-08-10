package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _141Test {

    private _141.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _141.Solution();
    }

    @Test
    public void test() {
        ListNode head = new ListNode(3);
        ListNode n1 = new ListNode(2);
        head.next = n1;
        n1.next = new ListNode(0);
        n1.next.next = new ListNode(-4);
        n1.next.next.next = n1;

        assertThat(solution.hasCycle(head)).isTrue();
    }
}
