package com.monds.ps.hackerrank.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WeightedUniformStringsTest {

    @Test
    void weightedUniformStrings() {
        assertThat(WeightedUniformStrings.weightedUniformStrings("abccddde", new int[]{1,3,12,5,9,10}))
                .isEqualTo(new String[]{"Yes","Yes","Yes","Yes","No","No"});
    }
}
