package com.monds.ps.hackerrank.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeightedUniformStrings {
    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
        List<String> result = new ArrayList<>();
        char prev = ' ';
        int sum = 0;
        int[] checks = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (prev == ch) sum += ch - 'a' + 1;
            else sum = ch - 'a' + 1;
            checks[i] = sum;
            prev = ch;
        }
        for (int query : queries) {
            result.add(has(checks, query) ? "Yes" : "No");
        }
        return result.toArray(new String[0]);
    }

    private static boolean has(int[] arr, int n) {
        for (int j : arr) {
            if (n == j) return true;
        }
        return false;
    }
}
