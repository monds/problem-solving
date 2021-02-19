package com.monds.ps.hackerrank.search;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MissingNumbersTest {

    @Test
    void missingNumbers() throws IOException {
        assertThat(MissingNumbers.missingNumbers(new int[]{7,2,5,3,5,3}, new int[]{7,2,5,4,6,3,5,3}))
                .isEqualTo(new int[] {4,6});

        Path file = Paths.get("src/test/resources/missing_numbers_test_case_1.txt");
        BufferedReader reader = Files.newBufferedReader(file);
        int n = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(reader.readLine());
        int[] brr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        assertThat(MissingNumbers.missingNumbers(arr, brr))
                .isEqualTo(new int[] {3670,3674,3677,3684,3685,3695,3714,3720});
    }
}
