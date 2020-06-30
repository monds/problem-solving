package com.monds.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-06-30
 */
public class BubbleSortTest {

    @Test
    public void sort() {

        assertArrayEquals(BubbleSort.sort(new int[] {4,3,2,1}), new int[] {1,2,3,4});

    }
}