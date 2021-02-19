package com.monds.ps.hackerrank.search;

import java.util.List;

public class SherlockAndArray {
    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        int left = 0;
        int right = sum;
        for (int n : arr) {
            left += n;
            if (left - n == right - n) return "YES";
            right -= n;
        }
        return "NO";
    }
}
