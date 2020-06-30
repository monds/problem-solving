package com.monds.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suahn on 2020-06-30
 */
public class SelectionSortTest {

    @Test
    public void sort() {
        assertArrayEquals(SelectionSort.sort(new int[] {4,3,2,1}), new int[] {1,2,3,4});
    }
}