package com.monds.ps.hackerrank.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MissingNumbers {
    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
        Map<Integer, Integer> numbers = new TreeMap<>();
        for (int num : brr) {
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            numbers.computeIfPresent(num, (n, i) -> i - 1);
        }
        List<Integer> result = new LinkedList<>();
        for (int num : numbers.keySet()) {
            if (numbers.get(num) > 0) result.add(num);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
