package com.monds.ps.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _107Test {

    private _107.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new _107.Solution();
    }

    @Test
    public void test() {

        TreeNode root = TreeNode.fromArray(new int[] {3,9,20,-999,-999,15,7});

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(15, 7));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(3));

        assertThat(solution.levelOrderBottom(root).toArray()).isEqualTo(expected.toArray());
    }
}
