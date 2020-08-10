package com.monds.algorithm.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by suahn on 2020-06-30
 */
public class InsertionSortTest {

    @Test
    public void sort() {
        int[] arr = {3,9,4,7,5,0,1,6,8,2};
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        assertThat(arr).isEqualTo(new int[] {0,1,2,3,4,5,6,7,8,9});
    }
}
