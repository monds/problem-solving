package com.monds.ps.hackerrank.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IceCreamParlorTest {

    @Test
    void whatFlavors() {
        assertThat(IceCreamParlor.whatFlavors(new int[]{2,4,5,3,1}, 4)).isEqualTo(new int[]{4,5});
    }
}
