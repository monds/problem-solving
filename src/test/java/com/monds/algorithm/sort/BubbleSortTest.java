package com.monds.algorithm.sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-06-30
 */
public class BubbleSortTest {

    @Test
    public void sort() {

        assertThat(BubbleSort.sort(new int[] {4,3,2,1})).isEqualTo(new int[] {1,2,3,4});

    }
}
